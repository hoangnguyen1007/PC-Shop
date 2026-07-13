package com.cuahangpc.service;

import com.cuahangpc.entity.CuaHang;

import java.util.List;

public interface CuaHangService {
    List<CuaHang> getAllCuaHang();
    CuaHang getCuaHangById(long id);
    CuaHang createCuaHang(CuaHang cuaHang);
    CuaHang updateCuaHang(long id, CuaHang cuaHang);
    void deleteCuaHang(long id);
}
