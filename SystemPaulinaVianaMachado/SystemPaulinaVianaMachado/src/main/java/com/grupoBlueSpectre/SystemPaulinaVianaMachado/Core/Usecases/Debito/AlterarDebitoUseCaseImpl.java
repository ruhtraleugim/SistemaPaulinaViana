package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Debito;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.DebitoDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.DebitoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.AlterarUserCase;

public class AlterarDebitoUseCaseImpl implements AlterarUserCase<DebitoDomain> {
    
    private final DebitoGateway debitoGateway;

    public AlterarDebitoUseCaseImpl(DebitoGateway debitoGateway){
        this.debitoGateway = debitoGateway;
    }
    @Override
    public DebitoDomain execute(Long ID, DebitoDomain debito) {
        debitoGateway.deleteDebito(ID);
        return debitoGateway.newDebito(debito);
    }
}