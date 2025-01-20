package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Gateway;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.ProdutoDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.ProdutoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.Produto.ProdutoMapper;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.ProdutoPercistence;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.Entities.ProdutoEntity;

public class ProdutoInfraGateway implements ProdutoGateway {

    private final ProdutoPercistence produtoRepository;
    private final ProdutoMapper produtoMapper;

    public ProdutoInfraGateway(ProdutoPercistence produtoRepository, ProdutoMapper produtoMapper) {
        this.produtoRepository = produtoRepository;
        this.produtoMapper = produtoMapper;
    }   
    @Override
    public Optional<ProdutoDomain> getProdutoByID(Long ID) {
        return produtoRepository.findById(ID).map(produtoMapper::entityToDomain);
    }
    @Override
    public Optional<ProdutoDomain> getProdutoByNome(String nomeProduto) {
        return produtoRepository.findByName(nomeProduto).map(produtoMapper::entityToDomain);
    }
    @Override
    public List<ProdutoDomain> getProdutoByDate(Date date) {
        return produtoRepository.findByDate(date).stream().map(produtoMapper::entityToDomain).toList();
    }
    @Override
    public List<ProdutoDomain> getProduto() {
        return produtoRepository.findAll().stream().map(produtoMapper::entityToDomain).toList();
    }
    @Override
    public ProdutoDomain newProduto(ProdutoDomain produtoModel) {
        ProdutoEntity produtoEntity = produtoMapper.toEntity(produtoModel);
        ProdutoEntity savedEntity = produtoRepository.save(produtoEntity);
        return produtoMapper.entityToDomain(savedEntity);
    }
    @Override
    public ProdutoDomain alterarProduto(ProdutoDomain produto, Long ID) {
        ProdutoEntity produtoEntity = produtoMapper.toEntity(produto);
        produtoRepository.updateProduto(produtoEntity, ID);
        return produtoMapper.entityToDomain(produtoEntity);
    }
    @Override
    public void deleteProduto(Long ID) {
        produtoRepository.deleteById(ID);
    }
}