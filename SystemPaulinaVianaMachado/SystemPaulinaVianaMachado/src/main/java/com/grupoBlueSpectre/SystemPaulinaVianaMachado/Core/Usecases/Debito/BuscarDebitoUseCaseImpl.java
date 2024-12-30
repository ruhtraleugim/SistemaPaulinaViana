package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Debito;

import java.util.List;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.DebitoModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.DebitoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.BuscarUseCase;

public class BuscarDebitoUseCaseImpl implements BuscarUseCase<DebitoModel>{

    private final DebitoGateway debitoGateway;

    public BuscarDebitoUseCaseImpl(DebitoGateway debitoGateway){
        this.debitoGateway = debitoGateway;
    }
    @Override
    public List<DebitoModel> execute() {
        return debitoGateway.GetDebito();
    }
}