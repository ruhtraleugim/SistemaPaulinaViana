package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Produto;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.ProdutoDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.ProdutoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.CriarUseCase;

public class CriarProdutoUseCaseImpl implements CriarUseCase<ProdutoDomain>{

    private final ProdutoGateway produtoGateway;

    public CriarProdutoUseCaseImpl(ProdutoGateway produtoGateway){
        this.produtoGateway = produtoGateway;
    }
    @Override
    public ProdutoDomain execute(ProdutoDomain produto) {
        return produtoGateway.newProduto(produto);
    }
}