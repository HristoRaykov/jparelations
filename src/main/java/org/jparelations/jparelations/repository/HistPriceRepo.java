package org.jparelations.jparelations.repository;

import org.jparelations.jparelations.entity.HistPrice;
import org.jparelations.jparelations.entity.SymbolDateId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistPriceRepo extends JpaRepository<HistPrice, SymbolDateId> {
}
