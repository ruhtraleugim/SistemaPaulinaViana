package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.EstoqueDomain;

public interface EstoqueGateway {
    
        Optional<EstoqueDomain> getEstoqueByID(Long ID);

        List<EstoqueDomain> getEstoques();

        List<EstoqueDomain> getEstoqueByDate(LocalDate date);

        void deletarEstoque(Long ID);

        EstoqueDomain criarEstoque(EstoqueDomain estoqueModel);

        EstoqueDomain updateEstoque(EstoqueDomain estoque, Long iD);

}