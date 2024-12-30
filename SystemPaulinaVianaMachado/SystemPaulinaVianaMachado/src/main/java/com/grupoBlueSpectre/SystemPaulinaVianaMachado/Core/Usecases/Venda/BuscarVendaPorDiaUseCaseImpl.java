package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Venda;

import java.util.Date;
import java.util.List;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.VendaModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.VendaGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.BuscarPorDataUseCase;

public class BuscarVendaPorDiaUseCaseImpl  implements BuscarPorDataUseCase<VendaModel>{
   
    private final VendaGateway vendaGateway;

    public BuscarVendaPorDiaUseCaseImpl(VendaGateway vendaGateway){
        this.vendaGateway = vendaGateway;
    }
    @Override
    public List<VendaModel> execute(Date date) {
        return vendaGateway.getVendasByDate(date);
    }
}
