package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Pagamento;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.PagamentoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.DeleteUsecase;

public class DeletePagamentoImpl implements DeleteUsecase{

    private final PagamentoGateway pagamentoGateway;

    public DeletePagamentoImpl(PagamentoGateway pagamentoGateway){
        this.pagamentoGateway = pagamentoGateway;
    }
    @Override
    public void execute(int ID) {
        pagamentoGateway.deletePagamento(ID);
    }
}
