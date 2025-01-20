package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.Entities.RelatorioEntity;

@Repository
public interface RelatorioPersistence extends JpaRepository<RelatorioEntity,Long> {
    
        List<RelatorioEntity> findByDate(Date date);

        RelatorioEntity updateRelatorio(RelatorioEntity entity , Long ID);
}