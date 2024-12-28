package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Debito;

import java.util.Optional;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.DebitoModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.DebitoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.BuscarPorIDUserCase;

public class BuscarDebitoPorID implements BuscarPorIDUserCase<DebitoModel>{

    private final DebitoGateway debitoGateway;
        
    public BuscarDebitoPorID(DebitoGateway debitoGateway){
        this.debitoGateway = debitoGateway;
    }
    @Override
    public Optional<DebitoModel> execute(int ID) {
        return debitoGateway.getDebitosByID(ID);
    }
}
