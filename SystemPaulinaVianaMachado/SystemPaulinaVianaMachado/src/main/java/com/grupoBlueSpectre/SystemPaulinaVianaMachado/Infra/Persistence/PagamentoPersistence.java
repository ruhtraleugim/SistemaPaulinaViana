package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.Entities.PagamentoEntity;

import jakarta.transaction.Transactional;

import java.util.Date;

@Repository
public interface PagamentoPersistence extends JpaRepository<PagamentoEntity, Long> {

    Optional<PagamentoEntity> findByDate(Date date);

    @Modifying
    @Transactional
    @Query
    PagamentoEntity updatePagamento(PagamentoEntity entity, Long ID);
}