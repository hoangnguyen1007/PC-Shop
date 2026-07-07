package com.cuahangpc.service;

import com.cuahangpc.dto.request.DonHangRequestDTO;
import com.cuahangpc.dto.respone.DonHangResponeDTO;

public interface DonHangService {
    public DonHangResponeDTO checkout(DonHangRequestDTO request);
}
