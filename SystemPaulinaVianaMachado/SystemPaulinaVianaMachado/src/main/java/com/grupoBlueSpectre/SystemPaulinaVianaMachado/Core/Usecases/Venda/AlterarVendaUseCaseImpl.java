package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Venda;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.VendaDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.VendaGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.AlterarUserCase;

public class AlterarVendaUseCaseImpl implements AlterarUserCase<VendaDomain>{
    
    private final VendaGateway vendaGateway;

    public AlterarVendaUseCaseImpl(VendaGateway vendaGateway){
        this.vendaGateway = vendaGateway;
    }

    @Override
    public VendaDomain execute(Long ID, VendaDomain venda) {
        return vendaGateway.alterarVenda(venda, ID);
    }
}