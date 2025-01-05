package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Venda;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.VendaModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.VendaGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.AlterarUserCase;

public class AlterarVendaUseCaseImpl implements AlterarUserCase<VendaModel>{
    
    private final VendaGateway vendaGateway;

    public AlterarVendaUseCaseImpl(VendaGateway vendaGateway){
        this.vendaGateway = vendaGateway;
    }

    @Override
    public VendaModel execute(int ID, VendaModel venda) {
        return vendaGateway.alterarVenda(venda, ID);
    }
}