package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Pagamento;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.PagamentoDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.PagamentoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.CriarUseCase;

public class CriarPagamentoUseCaseImpl implements CriarUseCase<PagamentoDomain>{
    
    private final PagamentoGateway pagamentoGateway;

    public CriarPagamentoUseCaseImpl(PagamentoGateway pagamentoGateway){
        this.pagamentoGateway = pagamentoGateway;
    }
    @Override
    public PagamentoDomain execute(PagamentoDomain Pagamento) {
        return pagamentoGateway.newPagamentoModel(Pagamento);
    }
}