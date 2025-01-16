package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Pagamento;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.PagamentoDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.PagamentoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.AlterarUserCase;

public class AlterarPagamentoUseCaseImpl implements AlterarUserCase<PagamentoDomain>{

    private final PagamentoGateway pagamentoGateway;

    public AlterarPagamentoUseCaseImpl(PagamentoGateway pagamentoGateway){
        this.pagamentoGateway = pagamentoGateway;
    }
    @Override
    public PagamentoDomain execute(int ID, PagamentoDomain altPagamento) {
        return pagamentoGateway.alterarPagamentoModel(ID, altPagamento);
    }
}