package repository;

import entity.CtdhId;
import entity.Ctdh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CtdhRepository extends JpaRepository<Ctdh, CtdhId> {
}
