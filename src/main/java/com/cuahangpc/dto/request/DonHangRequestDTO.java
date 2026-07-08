package com.cuahangpc.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
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
    @NotNull(message = "Ma khach hang khong duoc bo trong")
    private long maKH;
    @NotNull(message = "Ma cua hang khong duoc bo trong")
    private long maCH;
    @NotNull
    @Valid
    List<CtdhRequestDTO> chiTietDonHang;
}
