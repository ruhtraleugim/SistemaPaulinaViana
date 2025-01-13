package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Estoque;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.EstoqueDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.EstoqueGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.CriarUseCase;

public class CriarEstoqueUseCaseImpl implements CriarUseCase<EstoqueDomain> {
    private final EstoqueGateway estoqueGateway;

    public CriarEstoqueUseCaseImpl(EstoqueGateway estoqueGateway){
        this.estoqueGateway = estoqueGateway;
    }
    @Override
    public EstoqueDomain execute(EstoqueDomain estoqueModel) {
        return estoqueGateway.criarEstoque(estoqueModel);
    }
}