package org.jparelations.jparelations.repository;

import org.jparelations.jparelations.entity.ComStk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComStkRepo extends JpaRepository<ComStk, String> {
}