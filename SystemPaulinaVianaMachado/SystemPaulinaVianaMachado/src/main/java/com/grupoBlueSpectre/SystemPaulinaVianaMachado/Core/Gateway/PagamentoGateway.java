package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.PagamentoModel;

public interface PagamentoGateway {
       
        Optional<PagamentoModel> getPagamentoByID(int ID);

        List<PagamentoModel> getPagamentos();

        List<PagamentoModel> getPagamentoByDate(Date date);

        PagamentoModel newPagamentoModel(PagamentoModel pagamento);

        PagamentoModel alterarPagamentoModel(int ID, PagamentoModel pagamento);

        Void deletePagamento(int ID);
}
