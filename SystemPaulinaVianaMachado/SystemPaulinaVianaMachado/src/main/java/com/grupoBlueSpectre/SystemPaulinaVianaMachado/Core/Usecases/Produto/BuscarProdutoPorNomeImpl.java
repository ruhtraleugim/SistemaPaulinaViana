package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Produto;

import java.util.Optional;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.ProdutoModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.ProdutoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.BuscarPorNomeUseCase;

public class BuscarProdutoPorNomeImpl implements BuscarPorNomeUseCase<ProdutoModel> {

    private final ProdutoGateway produtoGateway;

    public BuscarProdutoPorNomeImpl(ProdutoGateway produtoGateway){
        this.produtoGateway = produtoGateway;
    }
    @Override
    public Optional<ProdutoModel> execute(String Nome) {
        return produtoGateway.getProdutoByNome(Nome);
    }
}