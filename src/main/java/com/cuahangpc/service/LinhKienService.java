package com.cuahangpc.service;

import com.cuahangpc.dto.request.LinhKienRequestDTO;
import com.cuahangpc.dto.respone.LinhKienResponseDTO;
import com.cuahangpc.entity.LinhKien;

import java.util.List;

public interface LinhKienService {
    List<LinhKienResponseDTO> getAllLinhKien();
    LinhKienResponseDTO getLinhKien(long id);
    LinhKienResponseDTO createLinhKien(LinhKienRequestDTO linhKien);
    LinhKienResponseDTO updateLinhKien(long id, LinhKienRequestDTO linhKien);
    void deleteLinhKien(long id);
}
