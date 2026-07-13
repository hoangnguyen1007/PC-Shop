package com.cuahangpc.controller;

import com.cuahangpc.entity.CuaHang;
import com.cuahangpc.service.CuaHangService;
import com.cuahangpc.service.KhachHangService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/cuahang")
public class CuaHangController {
    private final CuaHangService cuaHangService;
    private final KhachHangService khachHangService;

    @GetMapping
    public ResponseEntity<List<CuaHang>> getAll()
    {
        return ResponseEntity.ok(cuaHangService.getAllCuaHang());
    }
    @GetMapping("/id")
    public ResponseEntity<CuaHang> getById(@PathVariable long id)
    {
        return ResponseEntity.ok(cuaHangService.getCuaHangById(id));
    }
    @PostMapping
    public ResponseEntity<CuaHang> create(@RequestBody CuaHang cuaHang)
    {
        return new ResponseEntity<>(cuaHangService.createCuaHang(cuaHang), HttpStatus.CREATED);
    }
    @PutMapping("/id")
    public ResponseEntity<CuaHang> update(@PathVariable long id, @RequestBody CuaHang cuaHang)
    {
        return ResponseEntity.ok(cuaHangService.updateCuaHang(id, cuaHang));
    }
    @DeleteMapping("/id")
    public ResponseEntity<Void> delete(@PathVariable long id)
    {
        cuaHangService.deleteCuaHang(id);
        return ResponseEntity.noContent().build();
    }
}
