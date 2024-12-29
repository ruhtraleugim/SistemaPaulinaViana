package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.ProdutoModel;

public interface ProdutoGateway {

        Optional<ProdutoModel> getProdutoByID(int ID);

        Optional<ProdutoModel> getProdutoByNome(String nomeProduto);

        List<ProdutoModel> getProdutoByDate(Date date);

        List<ProdutoModel> getProduto();

        ProdutoModel newProduto(ProdutoModel produtoModel);

        ProdutoModel alternarProduto(ProdutoModel produto, int ID);
}
