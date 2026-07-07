package com.cuahangpc.repository;

import com.cuahangpc.entity.LinhKien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinhKienRepository extends JpaRepository<LinhKien, Long> {
}
