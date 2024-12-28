package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Estoque;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.EstoqueModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.EstoqueGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.CriarUseCase;

public class CriarEstoqueUseCaseImpl implements CriarUseCase<EstoqueModel> {
    private final EstoqueGateway estoqueGateway;

    public CriarEstoqueUseCaseImpl(EstoqueGateway estoqueGateway){
        this.estoqueGateway = estoqueGateway;
    }
    @Override
    public EstoqueModel execute(EstoqueModel estoqueModel) {
        return estoqueGateway.criarEstoque(estoqueModel);
    }
}
