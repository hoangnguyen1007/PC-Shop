package com.cuahangpc.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CtdhRequestDTO {
    @NotNull(message = "Ma PC khong duoc bo trong")
    private long maPC;
    @Min(value = 1, message = "So luong phai lon hon 0")
    private int soLuong;
    @Min(value = 0, message = "Don gia khong duoc am")
    private int donGia;
}
