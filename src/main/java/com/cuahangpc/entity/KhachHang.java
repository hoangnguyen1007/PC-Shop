package com.cuahangpc.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "KHACHHANG")
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaKH")
    private long maKH;
    @Column(name = "TenKH", nullable = false)
    private String tenKH;
    @Column(length = 10)
    private String sdt;
}
