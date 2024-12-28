package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway;

import java.util.List;
import java.util.Optional;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.DebitoModel;

public interface DebitoGateway {

        Optional<DebitoModel> getDebitosByID(int ID);

        List<DebitoModel> GetDebito();

        void deleteDebito(int ID);

        DebitoModel newDebito(DebitoModel debito);
}
