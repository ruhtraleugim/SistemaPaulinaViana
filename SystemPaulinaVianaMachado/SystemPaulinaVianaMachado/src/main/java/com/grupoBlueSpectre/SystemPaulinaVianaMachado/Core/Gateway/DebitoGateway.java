package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.DebitoModel;

public interface DebitoGateway {
        
        DebitoModel newDebito(DebitoModel debito);
        
        List<DebitoModel> GetDebito();

        Optional<DebitoModel> getDebitosByID(int ID);

        List<DebitoModel> getDebitosByDate(Date date);

        void deleteDebito(int ID);
}
