package com.cuahangpc.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LinhKienPCId {
    private long maPC;
    private long maLK;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LinhKienPCId that = (LinhKienPCId) o;
        return maPC == that.maPC && maLK == that.maLK;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maPC, maLK);
    }
}
