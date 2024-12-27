package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway;

import java.util.List;
import java.util.Optional;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.VendaModel;

public interface VendaGateway {
    
        Optional<VendaModel> getVendaByID(int id);  

        List<VendaModel> getVendas();

        VendaModel newVenda( VendaModel venda);

        
}
