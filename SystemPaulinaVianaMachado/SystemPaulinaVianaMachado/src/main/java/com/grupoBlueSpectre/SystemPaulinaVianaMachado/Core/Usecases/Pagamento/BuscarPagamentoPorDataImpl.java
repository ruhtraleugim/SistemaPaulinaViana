package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Pagamento;

import java.util.Date;
import java.util.List;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.PagamentoModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.PagamentoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.BuscarPorDataUseCase;

public class BuscarPagamentoPorDataImpl implements BuscarPorDataUseCase<PagamentoModel> {

    private final PagamentoGateway pagamentoGateway;

    public BuscarPagamentoPorDataImpl(PagamentoGateway pagamentoGateway){
        this.pagamentoGateway = pagamentoGateway;
    }
    @Override
    public List<PagamentoModel> execute(Date date) {
        return pagamentoGateway.getPagamentoByDate(date);
    }
}
