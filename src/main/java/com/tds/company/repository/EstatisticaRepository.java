package com.tds.company.repository;

import com.tds.company.domain.EstatisticaEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EstatisticaRepository extends JpaRepository<EstatisticaEntity, Long> {

    Page<EstatisticaEntity> findAll(Pageable page);
    Optional<EstatisticaEntity> findAllByUrlEncurtada(String urlEncurtada);


}
