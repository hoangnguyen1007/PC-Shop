package com.cuahangpc.service;

import com.cuahangpc.dto.request.CuaHangRequsetDTO;
import com.cuahangpc.dto.respone.CuaHangResponseDTO;
import com.cuahangpc.entity.CuaHang;

import java.util.List;

public interface CuaHangService {
    List<CuaHangResponseDTO> getAllCuaHang();
    CuaHangResponseDTO getCuaHangById(long id);
    CuaHangResponseDTO createCuaHang(CuaHangRequsetDTO cuaHang);
    CuaHangResponseDTO updateCuaHang(long id, CuaHangRequsetDTO cuaHang);
    void deleteCuaHang(long id);
}
