package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.PagamentoDomain;

public interface PagamentoGateway {
       
        Optional<PagamentoDomain> getPagamentoByID(Long ID);

        List<PagamentoDomain> getPagamentos();

        List<PagamentoDomain> getPagamentoByDate(Date date);

        PagamentoDomain newPagamentoModel(PagamentoDomain pagamento);

        PagamentoDomain alterarPagamentoModel(Long ID, PagamentoDomain pagamento);

        void deletePagamento(Long ID);
}
