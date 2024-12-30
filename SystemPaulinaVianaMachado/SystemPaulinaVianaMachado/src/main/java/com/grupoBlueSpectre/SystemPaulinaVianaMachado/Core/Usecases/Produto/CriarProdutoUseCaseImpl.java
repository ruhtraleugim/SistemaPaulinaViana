package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Produto;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.ProdutoModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.ProdutoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.CriarUseCase;

public class CriarProdutoUseCaseImpl implements CriarUseCase<ProdutoModel>{

    private final ProdutoGateway produtoGateway;

    public CriarProdutoUseCaseImpl(ProdutoGateway produtoGateway){
        this.produtoGateway = produtoGateway;
    }
    @Override
    public ProdutoModel execute(ProdutoModel produto) {
        return produtoGateway.newProduto(produto);
    }
}