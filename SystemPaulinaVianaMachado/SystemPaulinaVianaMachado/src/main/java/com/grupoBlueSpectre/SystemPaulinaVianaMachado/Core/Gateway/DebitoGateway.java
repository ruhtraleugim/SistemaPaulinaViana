package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.DebitoDomain;

public interface DebitoGateway {
        
        DebitoDomain newDebito(DebitoDomain debito);
        
        List<DebitoDomain> GetDebito();

        Optional<DebitoDomain> getDebitosByID(Long ID);

        List<DebitoDomain> getDebitosByDate(Date date);

        void deleteDebito(Long ID);
}
