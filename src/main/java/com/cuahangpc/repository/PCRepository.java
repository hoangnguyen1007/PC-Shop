package com.cuahangpc.repository;

import com.cuahangpc.entity.PC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PCRepository extends JpaRepository<PC, Long> {
}
