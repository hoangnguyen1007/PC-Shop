package com.cuahangpc.service.impl;

import com.cuahangpc.entity.KhachHang;
import com.cuahangpc.exception.ResourceNotFoundException;
import com.cuahangpc.repository.KhachHangRepository;
import com.cuahangpc.service.KhachHangService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KhachHangServiceImpl implements KhachHangService {
    private final KhachHangRepository khachHangRepository;

    @Override
    public List<KhachHang> getAllKhachHang() {
        return khachHangRepository.findAll();
    }

    @Override
    public KhachHang getKhachHangById(long id)
    {
        return khachHangRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Khong tim thay khach hang ID: " + id));
    }

    @Override
    public KhachHang createKhachHang(KhachHang khachHang)
    {
        return khachHangRepository.save(khachHang);
    }

    @Override
    public KhachHang updateKhachHang(long id, KhachHang khachHang)
    {
        KhachHang kh = getKhachHangById(id);
        kh.setTenKH(khachHang.getTenKH());
        kh.setSdt(khachHang.getSdt());
        return khachHangRepository.save(kh);
    }

    @Override
    public void deleteKhachHang(long id)
    {
        KhachHang kh = getKhachHangById(id);
        khachHangRepository.delete(kh);
    }
}
