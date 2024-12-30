package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Venda;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.VendaModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.VendaGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.CriarUseCase;

public class CriarVendaUseCaseImpl implements CriarUseCase<VendaModel>{

    private final VendaGateway vendaGateway;

    public CriarVendaUseCaseImpl(VendaGateway vendaGateway){
        this.vendaGateway = vendaGateway;
    }

    @Override
    public VendaModel execute(VendaModel venda) {
       return vendaGateway.newVenda(venda);
    }
}