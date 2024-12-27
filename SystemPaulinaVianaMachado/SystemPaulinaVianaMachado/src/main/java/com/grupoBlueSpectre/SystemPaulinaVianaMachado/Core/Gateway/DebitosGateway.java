package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway;

import java.util.List;
import java.util.Optional;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.DebitosModel;

public interface DebitosGateway {

        Optional<DebitosModel> getDebitosByID(int ID);

        List<DebitosModel> GetDebitos();
        
        DebitosModel newDebito(DebitosModel debito);
        
        void deleteDebito(int ID);

}
