package com.cuahangpc.dto.request;

import jakarta.validation.constraints.Min;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

@Data
public class CtdhRequestDTO {
    @NotNull
    private long maPC;
    @Min(1)
    private int soLuong;
    @Min(0)
    private int donGia;
}
