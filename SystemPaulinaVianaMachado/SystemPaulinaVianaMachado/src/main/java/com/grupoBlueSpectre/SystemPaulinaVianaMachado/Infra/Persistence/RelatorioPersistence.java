package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.Entities.RelatorioEntity;

@Repository
public interface RelatorioPersistence extends JpaRepository<RelatorioEntity,Long> {
    
}