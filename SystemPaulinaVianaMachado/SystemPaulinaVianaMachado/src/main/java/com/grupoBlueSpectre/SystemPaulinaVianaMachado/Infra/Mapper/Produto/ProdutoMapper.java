package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.Produto;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.ProdutoDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Dto.ProdutoDTO;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Entities.ProdutoEntity;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.MapperInteface;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.Fornecedor.FornecedorMapper;

public class ProdutoMapper implements MapperInteface<ProdutoDomain, ProdutoDTO, ProdutoEntity> {
    
    private final FornecedorMapper fornecedorMapper;

    public ProdutoMapper( FornecedorMapper fornecedorMapper){
        this.fornecedorMapper = fornecedorMapper;
    }
    @Override
    public ProdutoDomain toDomain(ProdutoDTO dto) {
        if (dto == null) {
            return null;
        }
        return new ProdutoDomain(dto.idProduto(),
                                dto.descricaoProduto(),
                                dto.nomeProduto(),
                                dto.validadeProduto(),
                                dto.tipoProduto(),
                                dto.valorProduto(),
                                dto.fornecedorDomain());
    }
    @Override
    public ProdutoDTO toDto(ProdutoDomain domain) {
        if (domain == null) {
            return null;
        }
       return new ProdutoDTO(domain.idProduto(),
                            domain.descricaoProduto(),
                            domain.nomeProduto(),
                            domain.validadeProduto(),
                            domain.tipoProduto(),
                            domain.valorProduto(),
                            domain.fornecedorDomain());
    }
    @Override
    public ProdutoEntity toEntity(ProdutoDomain domain) {
        if (domain == null) {
            return null;
        }
        return new ProdutoEntity(domain.idProduto(),
                            domain.descricaoProduto(),
                            domain.nomeProduto(),
                            domain.validadeProduto(),
                            domain.tipoProduto(),
                            domain.valorProduto(),
                            fornecedorMapper.toEntity(domain.fornecedorDomain()));
    }

    @Override
    public ProdutoDomain entityToDomain(ProdutoEntity entity) {
        if (entity == null) {
            return null;
        }
        return new ProdutoDomain(entity.getIdProduto(),
                                entity.getDescricaoProduto(),
                                entity.getNomeProduto(),
                                entity.getValidadeProduto(),
                                entity.getTipoProduto(),
                                entity.getValorProduto(),
                                fornecedorMapper.entityToDomain(entity.getFornecedorEntity()));
    }
}