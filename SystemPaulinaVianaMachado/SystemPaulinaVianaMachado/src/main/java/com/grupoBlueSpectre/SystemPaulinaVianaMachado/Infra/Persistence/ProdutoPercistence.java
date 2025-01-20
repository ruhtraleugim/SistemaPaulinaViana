package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.Entities.ProdutoEntity;

import jakarta.transaction.Transactional;

import java.util.Date;

@Repository
public interface ProdutoPercistence extends JpaRepository<ProdutoEntity, Long> {
    
    Optional<ProdutoEntity> findByName(String name);

    List<ProdutoEntity> findByDate(Date date);

    @Modifying
    @Transactional
    @Query
    ProdutoPercistence updateProduto(ProdutoEntity entity , Long ID);
}