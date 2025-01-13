package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Pagamento;

import java.util.Optional;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.PagamentoDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.PagamentoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.BuscarPorIDUserCase;

public class BuscarPagamentoPorIDUseCaseImpl implements BuscarPorIDUserCase<PagamentoDomain>{
    
    private final PagamentoGateway pagamentoGateway;

    public BuscarPagamentoPorIDUseCaseImpl(PagamentoGateway pagamentoGateway){
        this.pagamentoGateway = pagamentoGateway;
    }
    @Override
    public Optional<PagamentoDomain> execute(int ID) {
        return pagamentoGateway.getPagamentoByID(ID);
    }
}