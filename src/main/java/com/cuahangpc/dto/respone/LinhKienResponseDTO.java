package com.cuahangpc.dto.respone;

import com.cuahangpc.entity.LinhKien;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LinhKienResponseDTO {
    private long maLK;
    private String tenLK;
    private long gia;
    public static LinhKienResponseDTO fromEntity(LinhKien linhKien)
    {
        return LinhKienResponseDTO.builder()
                .maLK(linhKien.getMaLK())
                .tenLK(linhKien.getTenLK())
                .gia(linhKien.getGia())
                .build();
    }
}
