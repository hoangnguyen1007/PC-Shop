package com.cuahangpc.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "DONHANG")
public class DonHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaDH")
    private long maDH;
    @Column(name = "NgayLap")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate ngayLap;
    @OneToMany(mappedBy = "donHang", cascade = CascadeType.ALL)
    private List<Ctdh> danhSachCtdh;

    // 2. KHÔNG DÙNG @Column. Tự viết hàm tính tổng tiền "on-the-fly" (tính động)
    public double getTongThanhTien() {
        if (danhSachCtdh == null) return 0.0;

        double tongTien = 0.0;
        for (Ctdh chiTiet : danhSachCtdh) {
            tongTien += chiTiet.getSoLuong() * chiTiet.getDonGia();
        }
        return tongTien;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "MaKH",
            referencedColumnName = "MaKH"
    )
    private KhachHang khachHang;
}
