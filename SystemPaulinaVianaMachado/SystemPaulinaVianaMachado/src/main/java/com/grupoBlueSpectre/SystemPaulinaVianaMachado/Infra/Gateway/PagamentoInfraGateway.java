package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Gateway;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.PagamentoDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.PagamentoGateway;

public class PagamentoInfraGateway implements PagamentoGateway {

    @Override
    public Optional<PagamentoDomain> getPagamentoByID(Long ID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPagamentoByID'");
    }

    @Override
    public List<PagamentoDomain> getPagamentos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPagamentos'");
    }

    @Override
    public List<PagamentoDomain> getPagamentoByDate(Date date) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPagamentoByDate'");
    }

    @Override
    public PagamentoDomain newPagamentoModel(PagamentoDomain pagamento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'newPagamentoModel'");
    }

    @Override
    public PagamentoDomain alterarPagamentoModel(Long ID, PagamentoDomain pagamento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alterarPagamentoModel'");
    }

    @Override
    public Void deletePagamento(Long ID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletePagamento'");
    }
    
}
