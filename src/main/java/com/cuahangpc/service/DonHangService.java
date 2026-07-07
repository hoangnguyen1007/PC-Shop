package com.cuahangpc.service;

import com.cuahangpc.dto.DonHangRequestDTO;
import com.cuahangpc.dto.DonHangResponeDTO;

public interface DonHangService {
    public DonHangResponeDTO checkout(DonHangRequestDTO request);
}
