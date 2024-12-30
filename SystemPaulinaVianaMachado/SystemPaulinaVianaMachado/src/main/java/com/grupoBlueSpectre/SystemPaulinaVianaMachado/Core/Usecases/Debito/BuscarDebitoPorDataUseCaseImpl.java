package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Debito;

import java.util.Date;
import java.util.List;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.DebitoModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.DebitoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.BuscarPorDataUseCase;

public class BuscarDebitoPorDataUseCaseImpl implements BuscarPorDataUseCase<DebitoModel>{

    private final DebitoGateway debitoGateway;

    public BuscarDebitoPorDataUseCaseImpl(DebitoGateway debitoGateway){
        this.debitoGateway = debitoGateway;
    }
    @Override
    public List<DebitoModel> execute(Date date) {
        return debitoGateway.getDebitosByDate(date);
    }
}
