package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Estoque;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.EstoqueDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.EstoqueGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.AlterarUserCase;

public class AlterarEstoqueUseCaseImpl implements AlterarUserCase<EstoqueDomain> {
   
    private final EstoqueGateway estoqueGateway;

    public AlterarEstoqueUseCaseImpl(EstoqueGateway estoqueGateway){
        this.estoqueGateway = estoqueGateway;
    }
    @Override
    public EstoqueDomain execute(int ID, EstoqueDomain estoqueModel) {
        return estoqueGateway.alterarEstoque(estoqueModel, ID);
    } 
}