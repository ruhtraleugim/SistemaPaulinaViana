package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Debito;

import java.util.Optional;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.DebitoDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.DebitoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.BuscarPorIDUserCase;

public class BuscarDebitoPorIDUseCaseImpl implements BuscarPorIDUserCase<DebitoDomain>{

    private final DebitoGateway debitoGateway;
        
    public BuscarDebitoPorIDUseCaseImpl(DebitoGateway debitoGateway){
        this.debitoGateway = debitoGateway;
    }
    @Override
    public Optional<DebitoDomain> execute(Long ID) {
        return debitoGateway.getDebitosByID(ID);
    }
}