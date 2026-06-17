package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "LINHKIEN")
public class LinhKien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaLK")
    private long maLK;
    @Column(name = "TenLK", nullable = false)
    private String tenLK;
    @Column(name = "Gia", nullable = false)
    private long gia;
}
