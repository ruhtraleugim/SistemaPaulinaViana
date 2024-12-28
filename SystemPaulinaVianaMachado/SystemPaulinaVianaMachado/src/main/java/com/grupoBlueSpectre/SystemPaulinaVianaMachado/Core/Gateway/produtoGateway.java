package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway;

import java.util.List;
import java.util.Optional;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.ProdutoModel;

public interface ProdutoGateway {

        Optional<ProdutoModel> getProdutoByID(int ID);

        Optional<ProdutoModel> getProdutoByNome(String nomeProduto);

        List<ProdutoModel> getProduto();

        ProdutoModel newProduto();

        ProdutoModel alternarProduto(ProdutoModel produto, int ID);
}
