package com.cuahangpc.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CtdhId {
    private long maDH;
    private long maPC;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CtdhId ctdhId = (CtdhId) o;
        return maDH == ctdhId.maDH && maPC == ctdhId.maPC;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maDH, maPC);
    }
}
