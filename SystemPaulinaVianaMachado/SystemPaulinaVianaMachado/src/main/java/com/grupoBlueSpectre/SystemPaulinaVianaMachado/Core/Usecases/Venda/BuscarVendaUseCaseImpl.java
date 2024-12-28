package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Venda;

import java.util.List;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.VendaModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.VendaGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.BuscarUseCase;

public class BuscarVendaUseCaseImpl implements BuscarUseCase<VendaModel>{
    private final VendaGateway vendaGateway;

    public BuscarVendaUseCaseImpl(VendaGateway vendaGateway){
        this.vendaGateway = vendaGateway;
    }
    @Override
    public List<VendaModel> execute() {
        return vendaGateway.getVendas();
    }
}
