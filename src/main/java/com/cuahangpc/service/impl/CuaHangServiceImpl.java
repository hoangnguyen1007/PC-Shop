package com.cuahangpc.service.impl;

import com.cuahangpc.dto.request.CuaHangRequsetDTO;
import com.cuahangpc.dto.respone.CuaHangResponseDTO;
import com.cuahangpc.entity.CuaHang;
import com.cuahangpc.exception.ResourceNotFoundException;
import com.cuahangpc.repository.CuaHangRepository;
import com.cuahangpc.service.CuaHangService;
import jakarta.transaction.Transactional;
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
    @Transactional
    public List<CuaHangResponseDTO> getAllCuaHang()
    {
        return cuaHangRepository.findAll()
                .stream()
                .map(CuaHangResponseDTO::fromEntity)
                .toList();
    }
    private CuaHang findEntityById(long id)
    {
        return cuaHangRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Khong tim thay cua hang co ID: " + id));
    }
    @Override
    @Transactional
    public CuaHangResponseDTO getCuaHangById(long id)
    {
       CuaHang cuaHang = findEntityById(id);
       return CuaHangResponseDTO.fromEntity(cuaHang);
    }
    @Override
    @Transactional
    public CuaHangResponseDTO createCuaHang(CuaHangRequsetDTO cuaHang)
    {
        CuaHang cuaHang1 = new CuaHang();
        cuaHang1.setTenCH(cuaHang.getTenCH());
        cuaHang1.setSdt(cuaHang.getSdt());
        cuaHang1.setDiaChi(cuaHang.getDiaChi());
        CuaHang saved = cuaHangRepository.save(cuaHang1);
        return CuaHangResponseDTO.fromEntity(saved);
    }
    @Override
    @Transactional
    public CuaHangResponseDTO updateCuaHang(long id, CuaHangRequsetDTO cuaHang)
    {
        CuaHang ch = findEntityById(id);
        ch.setSdt(cuaHang.getSdt());
        ch.setDiaChi(cuaHang.getDiaChi());
        ch.setTenCH(cuaHang.getTenCH());
        CuaHang saved =  cuaHangRepository.save(ch);
        return CuaHangResponseDTO.fromEntity(saved);
    }
    @Override
    @Transactional
    public void deleteCuaHang(long id)
    {
        CuaHang ch = findEntityById(id);
        cuaHangRepository.delete(ch);
    }
}
