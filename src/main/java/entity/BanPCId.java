package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BanPCId {
    private long maPC;
    private long maCH;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BanPCId banPCId = (BanPCId) o;
        return maPC == banPCId.maPC && maCH == banPCId.maCH;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maPC, maCH);
    }
}
