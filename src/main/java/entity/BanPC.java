package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@jakarta.persistence.Entity
@IdClass(BanPCId.class)
@Table(name = "BANPC")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BanPC {
    @Id
    @Column(name = "MaPC")
    private long maPC;
    @Id
    @Column(name = "MaCH")
    private long maCH;
    @ManyToOne
    @MapsId("maCH")
    @JoinColumn(name = "MaCH", referencedColumnName = "MaCH", insertable = false, updatable = false)
    private CuaHang cuaHang;
    @ManyToOne
    @MapsId("maPC")
    @JoinColumn(name = "MaPC", referencedColumnName = "MaPC", insertable = false, updatable = false)
    private PC pc;
    @Column(name = "SLTonKho", nullable = false)
    private int slTonKho;
}
