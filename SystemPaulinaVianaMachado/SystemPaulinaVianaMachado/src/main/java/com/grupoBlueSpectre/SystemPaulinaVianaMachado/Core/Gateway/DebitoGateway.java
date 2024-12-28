package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway;

import java.util.List;
import java.util.Optional;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.DebitosModel;

public interface DebitoGateway {

        Optional<DebitosModel> getDebitosByID(int ID);

        List<DebitosModel> GetDebitos();

        void deleteDebito(int ID);

        DebitosModel newDebito(DebitosModel debito);
        
        

}
