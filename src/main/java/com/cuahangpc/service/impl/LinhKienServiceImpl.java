package com.cuahangpc.service.impl;

import com.cuahangpc.dto.request.LinhKienRequestDTO;
import com.cuahangpc.dto.respone.LinhKienResponseDTO;
import com.cuahangpc.entity.LinhKien;
import com.cuahangpc.exception.ResourceNotFoundException;
import com.cuahangpc.repository.LinhKienRepository;
import com.cuahangpc.service.LinhKienService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinhKienServiceImpl implements LinhKienService {
    private final LinhKienRepository linhKienRepository;
    LinhKienServiceImpl(LinhKienRepository linhKienRepository)
    {
        this.linhKienRepository = linhKienRepository;
    }
    private LinhKien findEntityById(long id)
    {
        return linhKienRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Khong tim thay linh kien co ID: " + id));
    }
    @Override
    @Transactional
    public List<LinhKienResponseDTO> getAllLinhKien()
    {
        return linhKienRepository.findAll()
                .stream()
                .map(LinhKienResponseDTO::fromEntity)
                .toList();
    }
    @Override
    @Transactional
    public LinhKienResponseDTO getLinhKien(long id)
    {
        LinhKien linhKien = findEntityById(id);
        return LinhKienResponseDTO.fromEntity(linhKien);
    }
    @Override
    @Transactional
    public LinhKienResponseDTO createLinhKien(LinhKienRequestDTO linhKien)
    {
        LinhKien linhKien1 = new LinhKien();
        linhKien1.setTenLK(linhKien.getTenLK());
        linhKien1.setGia(linhKien.getGia());
        LinhKien saved = linhKienRepository.save(linhKien1);
        return LinhKienResponseDTO.fromEntity(saved);
    }
    @Override
    @Transactional
    public LinhKienResponseDTO updateLinhKien(long id, LinhKienRequestDTO linhKien) {
        LinhKien lk = findEntityById(id);
        lk.setGia(linhKien.getGia());
        lk.setTenLK(linhKien.getTenLK());
        LinhKien saved = linhKienRepository.save(lk);
        return LinhKienResponseDTO.fromEntity(saved);
    }
    @Override
    @Transactional
    public void deleteLinhKien(long id)
    {
        LinhKien lk = linhKienRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Khong tim thay linh kien ID: "+ id));
        linhKienRepository.delete(lk);
    }
}
