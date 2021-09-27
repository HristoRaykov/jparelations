package org.jparelations.jparelations.repository;

import org.jparelations.jparelations.entity.DebtSec;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DebtSecRepo extends JpaRepository<DebtSec, String> {
}