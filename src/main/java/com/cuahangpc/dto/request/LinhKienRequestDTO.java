package com.cuahangpc.dto.request;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class LinhKienRequestDTO {
    @NotNull(message = "Ten linh kien khong duoc null")
    private String tenLK;
    private long gia;
}
