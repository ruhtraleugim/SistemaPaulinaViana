package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Venda;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.VendaGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.DeleteUsecase;

public class DeleteVendaUseCaseImpl implements DeleteUsecase{
    
    private final VendaGateway vendaGateway;

    public DeleteVendaUseCaseImpl(VendaGateway vendaGateway){
        this.vendaGateway = vendaGateway;
    }
    @Override
    public void execute(int ID) {
        vendaGateway.deleteVenda(ID);
    }
}