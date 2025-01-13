package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.EstoqueDomain;

public interface EstoqueGateway {
    
        Optional<EstoqueDomain> getEstoqueByID(int ID);

        List<EstoqueDomain> getEstoques();

        List<EstoqueDomain> getEstoqueByDate(Date date);

        void deletarEstoque(int ID);

        EstoqueDomain criarEstoque(EstoqueDomain estoqueModel);

        EstoqueDomain alterarEstoque(EstoqueDomain estoque, int ID);
}
