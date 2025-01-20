package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.Entities.EstoqueEntity;

import java.util.Date;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import jakarta.transaction.Transactional;

@Repository
public interface EstoquePersistence extends JpaRepository<EstoqueEntity, Long>{

    Optional<EstoqueEntity> findByDate(Date date);
    
    @Modifying
    @Transactional
    @Query("UPDATE EstoqueEntity e SET " +"e.quantidadeProduto = :#{#entity.quantidadeProduto}, " +
    "e.dataEstoque = :#{#entity.dataEstoque}, " +"e.fornecedor = :#{#entity.fornecedor}, " +
    "e.produto = :#{#entity.produto} " +"WHERE e.id = :id")
    EstoqueEntity updadeEstoque(EstoqueEntity entity,Long id);

}   