package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.Estoque;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.EstoqueDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Dto.EstoqueDTO;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.MapperInteface;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.Fornecedor.FornecedorMapper;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.Produto.ProdutoMapper;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.Entities.EstoqueEntity;

@Component
public class EstoqueMapper implements MapperInteface<EstoqueDomain, EstoqueDTO, EstoqueEntity> {
    
    private final FornecedorMapper fornecedorMapper;
    private final ProdutoMapper produtoMapper;

    public EstoqueMapper(@Lazy FornecedorMapper fornecedorMapper,@Lazy ProdutoMapper produtoMapper) {
        this.fornecedorMapper = fornecedorMapper;
        this.produtoMapper = produtoMapper;
    }
    @Override
    public EstoqueDomain toDomain(EstoqueDTO dto) {
        if (dto == null) {
            return null;
        }
        return new EstoqueDomain(dto.idEstoque(),
                                dto.versaoEstoque(),
                                dto.quantidadeProduto(),
                                dto.dataEstoque(),
                                fornecedorMapper.toDomain(dto.fornecedor()),
                                produtoMapper.toDomain(dto.produto()));
    }
    @Override
    public EstoqueDTO toDto(EstoqueDomain domain) {
        if (domain == null) {
            return null;
        }
        return new EstoqueDTO(domain.idEstoque(),
                            domain.versaoEstoque(),
                            domain.quantidadeProduto(),
                            domain.dataEstoque(),
                            fornecedorMapper.toDto(domain.fornecedor()),  
                            produtoMapper.toDto(domain.produto()));
    }
    @Override
    public EstoqueEntity toEntity(EstoqueDomain domain) {
        if (domain == null) {
            return null;
        }
        return new EstoqueEntity(domain.idEstoque(),
                                domain.versaoEstoque(),
                                domain.quantidadeProduto(),
                                domain.dataEstoque(),
                                fornecedorMapper.toEntity(domain.fornecedor()),  
                                produtoMapper.toEntity(domain.produto()));
    }
    @Override
    public EstoqueDomain entityToDomain(EstoqueEntity entity) {
        if (entity == null) {
            return null;
        }
        return new EstoqueDomain(entity.getIdEstoque(),
                                entity.getVersaoEstoque(),
                                entity.getQuantidadeProduto(),
                                entity.getDataEstoque(),
                                fornecedorMapper.entityToDomain(entity.getFornecedor()),  
                                produtoMapper.entityToDomain(entity.getProduto()));
    }
}