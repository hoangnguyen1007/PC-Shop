package com.cuahangpc.service.impl;

import com.cuahangpc.dto.CtdhRequestDTO;
import com.cuahangpc.dto.DonHangRequestDTO;
import com.cuahangpc.dto.DonHangResponeDTO;
import com.cuahangpc.entity.*;
import com.cuahangpc.repository.BanPCRepository;
import com.cuahangpc.repository.DonHangRepository;
import com.cuahangpc.repository.KhachHangRepository;
import com.cuahangpc.repository.PCRepository;
import com.cuahangpc.service.DonHangService;
import com.cuahangpc.service.KhachHangService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class DonHangServiceImpl implements DonHangService {
    private final BanPCRepository banPCRepository;
    private final DonHangRepository donHangRepository;
    private final KhachHangRepository khachHangRepository;
    private final PCRepository pcRepository;
    @Override
    public DonHangResponeDTO checkout(DonHangRequestDTO request)
    {
        KhachHang khachHang = khachHangRepository.findById(request.getMaKH())
                .orElseThrow(() -> new RuntimeException("Khong tim thay khach hang!"));
        DonHang donHang = new DonHang();
        donHang.setNgayLap(LocalDate.now());
        donHang.setKhachHang(khachHang);

        List<Ctdh> danhSachCtdh = new ArrayList<>();
        for(CtdhRequestDTO ctdhRequestDTO : request.getChiTietDonHang())
        {
            PC pc = pcRepository.findById(ctdhRequestDTO.getMaPC())
                    .orElseThrow(() ->  new RuntimeException("Khong tim thay PC tuong ung"));
            BanPCId banPCId = new BanPCId(ctdhRequestDTO.getMaPC(), request.getMaCH());
            BanPC khoHang = banPCRepository.findById(banPCId)
                    .orElseThrow(() -> new RuntimeException("Khong ton tai san pham!"));
            if(khoHang.getSlTonKho() <ctdhRequestDTO.getSoLuong())
                throw new RuntimeException("Khong du so luong ton kho!");
            khoHang.setSlTonKho(khoHang.getSlTonKho() - ctdhRequestDTO.getSoLuong());
            banPCRepository.save(khoHang);
            Ctdh ctdh = new Ctdh();
            ctdh.setDonHang(donHang);
            ctdh.setPc(pc);
            ctdh.setSoLuong(ctdhRequestDTO.getSoLuong());
            ctdh.setDonGia(ctdhRequestDTO.getDonGia());
            danhSachCtdh.add(ctdh);
        }
        donHang.setDanhSachCtdh(danhSachCtdh);
        DonHang savedDonHang = donHangRepository.save(donHang);
        DonHangResponeDTO donHangResponeDTO = new DonHangResponeDTO();
        donHangResponeDTO.setNgayLap(savedDonHang.getNgayLap());
        donHangResponeDTO.setMaDH(savedDonHang.getMaDH());
        donHangResponeDTO.setThongBao("Dat hang thanh cong!");
        donHangResponeDTO.setTongTien(savedDonHang.getTongThanhTien());
        return donHangResponeDTO;
    }
}
