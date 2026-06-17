package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@jakarta.persistence.Entity
@Getter
@Table(name = "CUAHANG")
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CuaHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaCH")
    private long maCH;
    @Column(name = "TenCH", nullable = false)
    private String tenCH;
    @Column(length = 10)
    private String sdt;
    @Column(name = "DiaChi")
    private String diaChi;
}
