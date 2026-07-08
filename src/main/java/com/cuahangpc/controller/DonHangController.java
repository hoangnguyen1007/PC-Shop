package com.cuahangpc.controller;

import com.cuahangpc.dto.request.DonHangRequestDTO;
import com.cuahangpc.dto.respone.DonHangResponeDTO;
import com.cuahangpc.service.DonHangService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/donhang")
@RequiredArgsConstructor
public class DonHangController {
    private final DonHangService donHangService;
    @PostMapping("/checkout")
    public ResponseEntity<DonHangResponeDTO> checkout(@Valid @RequestBody DonHangRequestDTO dto)
    {
        DonHangResponeDTO responeDTO = donHangService.checkout(dto);
        return new ResponseEntity<>(responeDTO, HttpStatus.CREATED);
    }
}
