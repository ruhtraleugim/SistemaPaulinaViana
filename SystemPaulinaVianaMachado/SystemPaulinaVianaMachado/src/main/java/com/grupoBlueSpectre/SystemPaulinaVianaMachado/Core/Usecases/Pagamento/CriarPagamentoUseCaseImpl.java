package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Pagamento;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.PagamentoModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.PagamentoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.CriarUseCase;

public class CriarPagamentoUseCaseImpl implements CriarUseCase<PagamentoModel>{
    
    private final PagamentoGateway pagamentoGateway;

    public CriarPagamentoUseCaseImpl(PagamentoGateway pagamentoGateway){
        this.pagamentoGateway = pagamentoGateway;
    }
    @Override
    public PagamentoModel execute(PagamentoModel Pagamento) {
        return pagamentoGateway.newPagamentoModel(Pagamento);
    }
}
