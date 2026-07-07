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
@Table(name = "LINHKIENPC")
@IdClass(LinhKienPCId.class)
public class LinhKienPC {
    @Id
    @Column(name = "MaPC")
    private long maPC;
    @Id
    @Column(name = "MaLK")
    private long maLK;
    @ManyToOne
    @MapsId("maPC")
    @JoinColumn(name = "MaPC", referencedColumnName = "MaPC", insertable = false, updatable = false)
    private PC pc;
    @ManyToOne
    @MapsId("maLK")
    @JoinColumn(name = "MaLK", referencedColumnName = "MaLK", insertable = false, updatable = false)
    private LinhKien linhKien;

}
