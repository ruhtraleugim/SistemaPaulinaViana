package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.Entities.FornecedorEntity;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import jakarta.transaction.Transactional;

@Repository
public interface FornecedorPercistence extends JpaRepository<FornecedorEntity, Long >{
    
    Optional<FornecedorEntity> findByNome(String nome);

    @Modifying
    @Transactional
    @Query("UPDATE FornecedorEntity f SET f.valorProdutoFornecedor = :#{#entity.valorProdutoFornecedor}, " +
            "f.fornecedorEndereco = :#{#entity.fornecedorEndereco}, " + "f.fornecedorNome = :#{#entity.fornecedorNome}, " +
            "f.fornecedorTelefone = :#{#entity.fornecedorTelefone}, " + "f.fornecedorEmail = :#{#entity.fornecedorEmail}, " +
            "f.tipoProduto = :#{#entity.tipoProduto} " + "WHERE f.idFornecedor = :id")
    FornecedorEntity updadeEstoque(FornecedorEntity entity,Long id);
    
}