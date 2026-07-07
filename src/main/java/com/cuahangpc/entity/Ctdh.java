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
@Table(name = "CTDH")
@IdClass(CtdhId.class)
public class Ctdh {
    @Id
    @Column(name = "MaDH")
    private long maDH;
    @Id
    @Column(name = "MaPC")
    private long maPC;
    @Column(name = "DonGia", nullable = false)
    private int donGia;
    @Column(name = "SoLuong")
    private int soLuong;
    @ManyToOne
    @MapsId("maPC")
    @JoinColumn(name = "MaPC", referencedColumnName = "MaPC", insertable = false, updatable = false)
    private PC pc;
    @ManyToOne
    @MapsId("maDH")
    @JoinColumn(name = "MaDH", referencedColumnName = "MaDH", insertable = false, updatable = false)
    private DonHang donHang;
}
