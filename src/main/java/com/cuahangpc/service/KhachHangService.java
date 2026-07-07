package com.cuahangpc.service;

import com.cuahangpc.entity.KhachHang;

import java.util.List;

public interface KhachHangService {
    List<KhachHang> getAllKhachHang();
    KhachHang getKhachHangById(long id);
    KhachHang createKhachHang(KhachHang khachHang);
    KhachHang updateKhachHang(long id, KhachHang khachHang);
    void deleteKhachHang(long id);
}
