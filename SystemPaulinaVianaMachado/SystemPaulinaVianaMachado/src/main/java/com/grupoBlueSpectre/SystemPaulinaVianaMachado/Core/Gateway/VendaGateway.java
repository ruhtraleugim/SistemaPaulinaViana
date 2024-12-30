package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.VendaModel;

public interface VendaGateway {
    
        Optional<VendaModel> getVendaByID(int id); 
        
        List<VendaModel> getVendasByDate(Date Data);

        List<VendaModel> getVendas();
        
        void deleteVenda(int id);

        VendaModel newVenda( VendaModel venda);

        VendaModel alterarVenda(VendaModel venda, int ID);
}
