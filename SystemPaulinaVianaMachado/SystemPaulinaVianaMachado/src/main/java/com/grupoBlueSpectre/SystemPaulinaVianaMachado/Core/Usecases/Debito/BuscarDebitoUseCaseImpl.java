package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Debito;

import java.util.List;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.DebitosModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.DebitoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.BuscarUseCase;

public class BuscarDebitoUseCaseImpl implements BuscarUseCase<DebitosModel>{

    private final DebitoGateway debitoGateway;

    public BuscarDebitoUseCaseImpl(DebitoGateway debitoGateway){
        this.debitoGateway = debitoGateway;
    }
    @Override
    public List<DebitosModel> execute() {
        return debitoGateway.GetDebitos();
    }
}
