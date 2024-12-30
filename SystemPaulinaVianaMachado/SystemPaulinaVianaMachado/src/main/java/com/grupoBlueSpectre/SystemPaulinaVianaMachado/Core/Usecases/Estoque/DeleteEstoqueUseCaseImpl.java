package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Estoque;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.EstoqueGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.DeleteUsecase;

public class DeleteEstoqueUseCaseImpl implements DeleteUsecase{

    private final EstoqueGateway estoqueGateway;

    public DeleteEstoqueUseCaseImpl(EstoqueGateway estoqueGateway){
        this.estoqueGateway = estoqueGateway;
    }
    @Override
    public void execute(int ID) {
        estoqueGateway.deletarEstoque(ID);
    }
}