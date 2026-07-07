package com.cuahangpc.repository;

import com.cuahangpc.entity.LinhKienPC;
import com.cuahangpc.entity.LinhKienPCId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinhKienPCRepository extends JpaRepository<LinhKienPC, LinhKienPCId> {
}
