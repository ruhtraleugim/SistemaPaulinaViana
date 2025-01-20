package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Gateway;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.ProdutoDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.ProdutoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.Produto.ProdutoMapper;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.ProdutoPercistence;

public class ProdutoInfraGateway implements ProdutoGateway {

    private final ProdutoPercistence produtoRepository;
    private final ProdutoMapper produtoMapper;

    public ProdutoInfraGateway(ProdutoPercistence produtoRepository, ProdutoMapper produtoMapper) {
        this.produtoRepository = produtoRepository;
        this.produtoMapper = produtoMapper;
    }   
    @Override
    public Optional<ProdutoDomain> getProdutoByID(Long ID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProdutoByID'");
    }
    @Override
    public Optional<ProdutoDomain> getProdutoByNome(String nomeProduto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProdutoByNome'");
    }
    @Override
    public List<ProdutoDomain> getProdutoByDate(Date date) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProdutoByDate'");
    }
    @Override
    public List<ProdutoDomain> getProduto() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProduto'");
    }
    @Override
    public ProdutoDomain newProduto(ProdutoDomain produtoModel) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'newProduto'");
    }
    @Override
    public ProdutoDomain alterarProduto(ProdutoDomain produto, Long ID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alterarProduto'");
    }
    @Override
    public void deleteProduto(Long ID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteProduto'");
    }
}