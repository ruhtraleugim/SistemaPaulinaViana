package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.Entities.VendaEntity;

@Repository
public interface VendaPersistence extends JpaRepository<VendaEntity,Long>{
    
    List<VendaEntity> findByDate(Date date);

    VendaEntity updateVenda(VendaEntity entity , Long ID);
}