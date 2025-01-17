package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Produto;

import java.util.List;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.ProdutoDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.ProdutoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.BuscarUseCase;

public class BuscarProdutoUseCaseImpl implements BuscarUseCase<ProdutoDomain> {
    
    private ProdutoGateway produtoGateway;

    public BuscarProdutoUseCaseImpl(ProdutoGateway produtoGateway){
        this.produtoGateway = produtoGateway;
    }
    @Override
    public List<ProdutoDomain> execute() {
        return produtoGateway.getProduto();
    }
}