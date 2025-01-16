package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Produto;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.ProdutoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.DeleteUsecase;

public class DeleteProdutoUseCaseImpl implements DeleteUsecase {

    private final ProdutoGateway produtoGateway;

    public DeleteProdutoUseCaseImpl(ProdutoGateway produtoGateway){
        this.produtoGateway = produtoGateway;
    }
    @Override
    public void execute(int ID) {
        produtoGateway.deleteProduto(ID);
    }
    
}