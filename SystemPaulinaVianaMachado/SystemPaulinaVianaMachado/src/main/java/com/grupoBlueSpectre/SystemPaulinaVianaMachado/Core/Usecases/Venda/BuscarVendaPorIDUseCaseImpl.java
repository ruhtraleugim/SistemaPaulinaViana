package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Venda;

import java.util.Optional;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.VendaModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.VendaGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.BuscarPorIDUserCase;

public class BuscarVendaPorIDUseCaseImpl implements BuscarPorIDUserCase<VendaModel>{

    private final VendaGateway vendaGateway;

    public BuscarVendaPorIDUseCaseImpl(VendaGateway vendaGateway){
        this.vendaGateway = vendaGateway;
    }
    @Override
    public Optional<VendaModel> execute(int ID) {
        return vendaGateway.getVendaByID(ID);
    }
}