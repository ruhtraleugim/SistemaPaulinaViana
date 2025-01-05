package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Debito;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.DebitoModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.DebitoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.AlterarUserCase;

public class AlterarDebitoUseCaseImpl implements AlterarUserCase<DebitoModel> {
    
    private final DebitoGateway debitoGateway;

    public AlterarDebitoUseCaseImpl(DebitoGateway debitoGateway){
        this.debitoGateway = debitoGateway;
    }
    @Override
    public DebitoModel execute(int ID, DebitoModel debito) {
        debitoGateway.deleteDebito(ID);
        return debitoGateway.newDebito(debito);
    }
}