package com.cuahangpc.controller;

import com.cuahangpc.entity.KhachHang;
import com.cuahangpc.service.KhachHangService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/khachhang")
@RequiredArgsConstructor
public class KhachHangController {
    private final KhachHangService khachHangService;
    @GetMapping
    public ResponseEntity<List<KhachHang>> getAll()
    {
        return ResponseEntity.ok(khachHangService.getAllKhachHang());
    }
    @GetMapping("/{id}")
    public ResponseEntity<KhachHang> getById(@PathVariable long id)
    {
        return ResponseEntity.ok(khachHangService.getKhachHangById(id));
    }
    @PostMapping
    public ResponseEntity<KhachHang> create(@RequestBody KhachHang kh)
    {
        return new ResponseEntity<>(khachHangService.createKhachHang(kh), HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<KhachHang> update(@PathVariable long id, @RequestBody KhachHang kh)
    {
        return ResponseEntity.ok(khachHangService.updateKhachHang(id, kh));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id)
    {
        khachHangService.deleteKhachHang(id);
        return ResponseEntity.noContent().build();
    }
}

