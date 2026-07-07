package com.cuahangpc.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class DonHangRequestDTO {
    private long maKH;
    private long maCH;
    List<CtdhRequestDTO> chiTietDonHang;
}
