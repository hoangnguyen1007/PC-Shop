package com.cuahangpc.service.impl;

import com.cuahangpc.entity.CuaHang;
import com.cuahangpc.exception.ResourceNotFoundException;
import com.cuahangpc.repository.CuaHangRepository;
import com.cuahangpc.service.CuaHangService;
import jakarta.validation.constraints.Max;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CuaHangServiceImpl implements CuaHangService {
    private final CuaHangRepository cuaHangRepository;
    @Override
    public List<CuaHang> getAllCuaHang()
    {
        return cuaHangRepository.findAll();
    }
    @Override
    public CuaHang getCuaHangById(long id)
    {
        return cuaHangRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Khong tim thay khach hang!"));
    }
    @Override
    public CuaHang createCuaHang(CuaHang cuaHang)
    {
        return cuaHangRepository.save(cuaHang);
    }
    @Override
    public CuaHang updateCuaHang(long id, CuaHang cuaHang)
    {
        CuaHang ch = cuaHangRepository.findById(id)
                        .orElseThrow(() -> new ResourceNotFoundException("Khong tim thay khach hang!"));
        ch.setSdt(cuaHang.getSdt());
        ch.setDiaChi(cuaHang.getDiaChi());
        ch.setTenCH(cuaHang.getTenCH());
        return cuaHangRepository.save(ch);
    }
    @Override
    public void deleteCuaHang(long id)
    {
        CuaHang ch = getCuaHangById(id);
        cuaHangRepository.delete(ch);
    }
}
