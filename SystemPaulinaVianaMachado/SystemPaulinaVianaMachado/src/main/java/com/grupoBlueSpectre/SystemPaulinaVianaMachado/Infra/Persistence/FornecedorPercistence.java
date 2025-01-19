package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.Entities.FornecedorEntity;

@Repository
public interface FornecedorPercistence extends JpaRepository<FornecedorEntity, Long >{
    
}