package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.Entities.DebitoEntity;

import java.util.Date;
import java.util.List;

@Repository
public interface DebitoPersistence extends JpaRepository<DebitoEntity,Long > {

        List<DebitoEntity> findByDataDebito(Date date);

}