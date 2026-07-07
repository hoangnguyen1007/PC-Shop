package com.cuahangpc.repository;

import com.cuahangpc.entity.CtdhId;
import com.cuahangpc.entity.Ctdh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CtdhRepository extends JpaRepository<Ctdh, CtdhId> {
}
