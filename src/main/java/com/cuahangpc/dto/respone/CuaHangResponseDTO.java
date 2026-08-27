package com.cuahangpc.dto.respone;

import com.cuahangpc.entity.CuaHang;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CuaHangResponseDTO {
    private long maCH;
    private String tenCH;
    private String sdt;
    private String diaChi;
    public static CuaHangResponseDTO fromEntity(CuaHang cuaHang)
    {
        return CuaHangResponseDTO.builder()
                .maCH(cuaHang.getMaCH())
                .tenCH(cuaHang.getTenCH())
                .sdt(cuaHang.getSdt())
                .diaChi(cuaHang.getDiaChi())
                .build();
    }
}
