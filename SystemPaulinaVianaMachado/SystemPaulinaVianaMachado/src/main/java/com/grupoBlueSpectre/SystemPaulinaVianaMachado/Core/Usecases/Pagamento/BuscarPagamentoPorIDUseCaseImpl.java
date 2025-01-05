package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Pagamento;

import java.util.Optional;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.PagamentoModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.PagamentoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.BuscarPorIDUserCase;

public class BuscarPagamentoPorIDUseCaseImpl implements BuscarPorIDUserCase<PagamentoModel>{
    
    private final PagamentoGateway pagamentoGateway;

    public BuscarPagamentoPorIDUseCaseImpl(PagamentoGateway pagamentoGateway){
        this.pagamentoGateway = pagamentoGateway;
    }
    @Override
    public Optional<PagamentoModel> execute(int ID) {
        return pagamentoGateway.getPagamentoByID(ID);
    }
}