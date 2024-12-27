package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway;

import java.util.List;
import java.util.Optional;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.EstoqueModel;

public interface EstoqueGateway {
    
        Optional<EstoqueModel> getEstoqueByID(int ID);

        List<EstoqueModel> getEstoques();

        EstoqueModel criarEvento(EstoqueModel estoqueModel);
     
}
