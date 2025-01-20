package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Pagamento;

import java.time.LocalDate;
import java.util.List;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.PagamentoDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.PagamentoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.BuscarPorDataUseCase;

public class BuscarPagamentoPorDataUseCaseImpl implements BuscarPorDataUseCase<PagamentoDomain> {

    private final PagamentoGateway pagamentoGateway;

    public BuscarPagamentoPorDataUseCaseImpl(PagamentoGateway pagamentoGateway){
        this.pagamentoGateway = pagamentoGateway;
    }
    @Override
    public List<PagamentoDomain> execute(LocalDate date) {
        return pagamentoGateway.getPagamentoByDate(date);
    }
}