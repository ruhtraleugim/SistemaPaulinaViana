package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Debito;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.DebitoModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.DebitoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.CriarUseCase;

public class CriarDebitoUseCaseImpl implements CriarUseCase<DebitoModel>{
    
    private final DebitoGateway debitoGateway;

    public CriarDebitoUseCaseImpl(DebitoGateway debitoGateway){
        this.debitoGateway = debitoGateway;
    }
    @Override
    public DebitoModel execute(DebitoModel debitoModel) {
        return debitoGateway.newDebito(debitoModel);
    }
}