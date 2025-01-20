package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.Entities.DebitoEntity;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DebitoPersistence extends JpaRepository<DebitoEntity,Long > {

    List<DebitoEntity> findByDataDebito(LocalDate dataDebito);

    @Modifying  
    @Transactional
    @Query("UPDATE DEBITO d SET d.valorDebito = :#{#debito.valorDebito}, " +
        "d.cpfCobrador = :#{#debito.cpfCobrador}, " +
        "d.descricaoConta = :#{#debito.descricaoConta}, " +
        "d.tipoConta = :#{#debito.tipoConta} " +
        "WHERE d.id = :id")
    DebitoEntity updateDebito(DebitoEntity debito, Long id);
}