package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Estoque;

import java.util.Date;
import java.util.List;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.EstoqueModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.EstoqueGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.BuscarPagamentosPorDataUseCase;

public class BuscarEstoquePorDataImpl implements BuscarPagamentosPorDataUseCase<EstoqueModel> {

    private final EstoqueGateway estoqueGateway;

    public BuscarEstoquePorDataImpl(EstoqueGateway estoqueGateway){
        this.estoqueGateway = estoqueGateway;
    }
    @Override
    public List<EstoqueModel> execute(Date date) {
        return estoqueGateway.getEstoqueByDate(date);
    }  
}
