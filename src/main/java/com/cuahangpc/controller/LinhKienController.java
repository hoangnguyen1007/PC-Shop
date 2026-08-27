package com.cuahangpc.controller;

import com.cuahangpc.dto.request.LinhKienRequestDTO;
import com.cuahangpc.dto.respone.LinhKienResponseDTO;
import com.cuahangpc.entity.LinhKien;
import com.cuahangpc.service.LinhKienService;
import com.cuahangpc.service.impl.LinhKienServiceImpl;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/linhkien")
@RequiredArgsConstructor
public class LinhKienController {
    private final LinhKienService linhKienService;
    @GetMapping
    public ResponseEntity<List<LinhKienResponseDTO>> getAll()
    {
        return new ResponseEntity<>(linhKienService.getAllLinhKien(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<LinhKienResponseDTO> getLinhKien(@PathVariable long id)
    {
        return new ResponseEntity<>(linhKienService.getLinhKien(id), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<LinhKienResponseDTO> createLinhKien(@RequestBody LinhKienRequestDTO linhKien)
    {
        return new ResponseEntity<>(linhKienService.createLinhKien(linhKien), HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<LinhKienResponseDTO> updateLinhKien(@PathVariable long id, @RequestBody LinhKienRequestDTO linhKien)
    {
        return new ResponseEntity<>(linhKienService.updateLinhKien(id, linhKien), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLinhKien(@PathVariable long id)
    {
        return ResponseEntity.noContent().build();
    }
}
