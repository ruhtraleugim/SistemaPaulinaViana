package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway;

import java.util.List;
import java.util.Optional;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.PagamentoModel;

public interface PagamentoGateway {
       
        Optional<PagamentoModel> getPagamentoByID(int ID);

        List<PagamentoModel> getPagamentos();

        PagamentoModel newPagamentoModel(PagamentoModel pagamento);

        PagamentoModel alterarPagamentoModel(int ID, PagamentoModel pagamento);
}