package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Entities.VendaEntity;

@Repository
public interface VendaPersistence extends JpaRepository<VendaEntity,Long>{
    
}