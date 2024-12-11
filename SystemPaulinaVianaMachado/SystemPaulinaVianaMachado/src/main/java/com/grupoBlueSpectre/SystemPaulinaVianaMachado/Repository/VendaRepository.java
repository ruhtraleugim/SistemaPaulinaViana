package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Model.VendaModel;

@Repository
public interface VendaRepository extends JpaRepository<VendaModel , Integer> {
}
