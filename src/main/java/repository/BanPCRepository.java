package repository;

import entity.BanPC;
import entity.BanPCId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BanPCRepository extends JpaRepository<BanPC, BanPCId> {
}
