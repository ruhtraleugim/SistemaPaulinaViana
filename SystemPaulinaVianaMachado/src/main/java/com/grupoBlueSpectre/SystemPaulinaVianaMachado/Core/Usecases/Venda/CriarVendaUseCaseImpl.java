package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Venda;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.VendaDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.VendaGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.CriarUseCase;

public class CriarVendaUseCaseImpl implements CriarUseCase<VendaDomain>{

    private final VendaGateway vendaGateway;

    public CriarVendaUseCaseImpl(VendaGateway vendaGateway){
        this.vendaGateway = vendaGateway;
    }

    @Override
    public VendaDomain execute(VendaDomain venda) {
       return vendaGateway.newVenda(venda);
    }
}