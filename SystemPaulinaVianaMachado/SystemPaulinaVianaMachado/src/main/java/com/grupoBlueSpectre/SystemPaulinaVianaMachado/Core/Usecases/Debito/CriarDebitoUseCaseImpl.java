package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Debito;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.DebitoDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.DebitoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.CriarUseCase;

public class CriarDebitoUseCaseImpl implements CriarUseCase<DebitoDomain>{
    
    private final DebitoGateway debitoGateway;

    public CriarDebitoUseCaseImpl(DebitoGateway debitoGateway){
        this.debitoGateway = debitoGateway;
    }
    @Override
    public DebitoDomain execute(DebitoDomain debitoModel) {
        return debitoGateway.newDebito(debitoModel);
    }
}