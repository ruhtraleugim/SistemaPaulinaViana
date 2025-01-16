package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.VendaDomain;

public interface VendaGateway {
    
        Optional<VendaDomain> getVendaByID(int id); 
        
        List<VendaDomain> getVendasByDate(Date Data);

        List<VendaDomain> getVendas();
        
        void deleteVenda(int id);

        VendaDomain newVenda( VendaDomain venda);

        VendaDomain alterarVenda(VendaDomain venda, int ID);
}
