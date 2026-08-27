package com.cuahangpc.dto.request;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NonNull;

@Data
public class CuaHangRequsetDTO {
    @NotNull(message = "Ten cua hang khong duoc bo trong")
    private String tenCH;
    private String sdt;
    private String diaChi;
}
