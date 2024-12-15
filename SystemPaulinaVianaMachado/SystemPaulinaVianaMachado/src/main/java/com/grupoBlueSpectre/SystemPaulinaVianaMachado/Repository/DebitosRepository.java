package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Model.DebitosModel;

@Repository
public interface DebitosRepository extends JpaRepository<DebitosModel , Integer>{   
}
