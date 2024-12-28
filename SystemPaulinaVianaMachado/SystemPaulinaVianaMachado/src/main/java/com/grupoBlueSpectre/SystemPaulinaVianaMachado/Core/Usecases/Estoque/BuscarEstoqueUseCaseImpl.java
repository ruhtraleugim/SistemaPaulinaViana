package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Estoque;

import java.util.List;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.EstoqueModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.EstoqueGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.BuscarUseCase;

public class BuscarEstoqueUseCaseImpl implements BuscarUseCase<EstoqueModel> {

    private final EstoqueGateway estoqueGateway;

    public BuscarEstoqueUseCaseImpl(EstoqueGateway estoqueGateway){
        this.estoqueGateway = estoqueGateway;
    }
    @Override
    public List<EstoqueModel> execute() {
        return estoqueGateway.getEstoques();
    }
}
