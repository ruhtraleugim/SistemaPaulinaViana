package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Pagamento;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.PagamentoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.DeleteUsecase;

public class DeletePagamentoUseCaseImpl implements DeleteUsecase{

    private final PagamentoGateway pagamentoGateway;

    public DeletePagamentoUseCaseImpl(PagamentoGateway pagamentoGateway){
        this.pagamentoGateway = pagamentoGateway;
    }
    @Override
    public void execute(Long ID) {
        pagamentoGateway.deletePagamento(ID);
    }
}