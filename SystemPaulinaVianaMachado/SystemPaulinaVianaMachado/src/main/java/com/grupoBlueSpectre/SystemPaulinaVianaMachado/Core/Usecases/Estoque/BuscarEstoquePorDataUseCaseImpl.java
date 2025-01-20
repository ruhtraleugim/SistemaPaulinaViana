package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Estoque;

import java.time.LocalDate;
import java.util.List;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.EstoqueDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.EstoqueGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.BuscarPorDataUseCase;

public class BuscarEstoquePorDataUseCaseImpl implements BuscarPorDataUseCase<EstoqueDomain> {

    private final EstoqueGateway estoqueGateway;

    public BuscarEstoquePorDataUseCaseImpl(EstoqueGateway estoqueGateway){
        this.estoqueGateway = estoqueGateway;
    }
    @Override
    public List<EstoqueDomain> execute(LocalDate date) {
        return estoqueGateway.getEstoqueByDate(date);
    }  
}