package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Produto;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.ProdutoModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.ProdutoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.AlterarUserCase;

public class AlterarProdutoUseCaseImpl implements AlterarUserCase<ProdutoModel> {

    private final ProdutoGateway produtoGateway;

    public AlterarProdutoUseCaseImpl(ProdutoGateway produtoGateway){
        this.produtoGateway = produtoGateway;
    }
    @Override
    public ProdutoModel execute(int ID, ProdutoModel newProduto) {
       return produtoGateway.alterarProduto(newProduto, ID);
    }
}