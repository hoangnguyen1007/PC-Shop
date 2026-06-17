package repository;

import entity.LinhKienPC;
import entity.LinhKienPCId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinhKienPCRepository extends JpaRepository<LinhKienPC, LinhKienPCId> {
}
