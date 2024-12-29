package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Pagamento;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.PagamentoModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.PagamentoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.AlterarUserCase;

public class AlterarPagamentoImpl implements AlterarUserCase<PagamentoModel>{

    private final PagamentoGateway pagamentoGateway;

    public AlterarPagamentoImpl(PagamentoGateway pagamentoGateway){
        this.pagamentoGateway = pagamentoGateway;
    }
    @Override
    public PagamentoModel execute(int ID, PagamentoModel altPagamento) {
        return pagamentoGateway.alterarPagamentoModel(ID, altPagamento);
    }
    
}
