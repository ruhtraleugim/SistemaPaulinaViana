package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Debito;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.DebitoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.DeleteUsecase;

public class DeleteDebitoUseCaseImpl implements DeleteUsecase{

    private final DebitoGateway debitoGateway;

    public DeleteDebitoUseCaseImpl(DebitoGateway debitoGateway){
        this.debitoGateway = debitoGateway;
    }
    @Override
    public void execute(int ID) {
        debitoGateway.deleteDebito(ID);
    }
}
