package com.cuahangpc.dto.respone;

import lombok.Data;

import java.time.LocalDate;

@Data
public class DonHangResponeDTO {
    private long maDH;
    private LocalDate ngayLap;
    private double tongTien;
    private String thongBao;
}
