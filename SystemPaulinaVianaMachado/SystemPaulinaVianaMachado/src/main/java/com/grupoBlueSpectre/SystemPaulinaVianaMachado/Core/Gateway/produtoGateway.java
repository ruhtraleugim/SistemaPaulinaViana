package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway;

import java.util.Optional;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.ProdutoModel;

public interface produtoGateway {

        Optional<ProdutoModel> getProdutoByID(int ID);
}
