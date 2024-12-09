package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Model.EstoqueModel;

public interface EstoqueRepository extends JpaRepository<EstoqueModel, Integer> {  
}
