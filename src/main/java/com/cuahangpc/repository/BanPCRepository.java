package com.cuahangpc.repository;

import com.cuahangpc.entity.BanPC;
import com.cuahangpc.entity.BanPCId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BanPCRepository extends JpaRepository<BanPC, BanPCId> {
}
