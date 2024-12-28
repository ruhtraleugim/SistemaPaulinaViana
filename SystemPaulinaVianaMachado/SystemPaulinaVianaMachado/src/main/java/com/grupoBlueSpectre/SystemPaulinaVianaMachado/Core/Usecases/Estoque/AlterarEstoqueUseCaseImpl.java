package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Estoque;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.EstoqueModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.EstoqueGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.AlterarUserCase;

public class AlterarEstoqueUseCaseImpl implements AlterarUserCase<EstoqueModel> {
    private final EstoqueGateway estoqueGateway;

    public AlterarEstoqueUseCaseImpl(EstoqueGateway estoqueGateway){
        this.estoqueGateway = estoqueGateway;
    }
    @Override
    public EstoqueModel execute(int ID, EstoqueModel estoqueModel) {
        return estoqueGateway.alterarEstoque(estoqueModel, ID);
    } 
}
