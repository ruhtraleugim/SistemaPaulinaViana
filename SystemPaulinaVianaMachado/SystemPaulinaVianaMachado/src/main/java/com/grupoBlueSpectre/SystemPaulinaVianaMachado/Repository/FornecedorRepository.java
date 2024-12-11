package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Model.FornecedorModel;

@Repository
public interface FornecedorRepository extends JpaRepository<FornecedorModel, Integer>{    
}
