package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Entities.PagamentoEntity;

@Repository
public interface PagamentoPersistence extends JpaRepository<PagamentoEntity, Long> {
    
}