package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.Entities.EstoqueEntity;

import java.time.LocalDate;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import jakarta.transaction.Transactional;

@Repository
public interface EstoquePersistence extends JpaRepository<EstoqueEntity, Long>{

    Optional<EstoqueEntity> findByDataEstoque(LocalDate dataEstoque);
    
    @Modifying
    @Transactional
    @Query("UPDATE ESTOQUE e SET e.versaoEstoque = :versaoEstoque, " +
            "e.quantidadeProduto = :quantidadeProduto, " +
            "e.dataEstoque = :dataEstoque, " +
            "e.fornecedor = :fornecedor, " +
            "e.produto = :produto " +
            "WHERE e.idEstoque = :idEstoque")
    EstoqueEntity updadeEstoque(EstoqueEntity entity,Long id);

}   