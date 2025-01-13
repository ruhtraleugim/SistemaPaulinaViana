package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Produto;

import java.util.Optional;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.ProdutoDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.ProdutoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.BuscarPorNomeUseCase;

public class BuscarProdutoPorNomeImpl implements BuscarPorNomeUseCase<ProdutoDomain> {

    private final ProdutoGateway produtoGateway;

    public BuscarProdutoPorNomeImpl(ProdutoGateway produtoGateway){
        this.produtoGateway = produtoGateway;
    }
    @Override
    public Optional<ProdutoDomain> execute(String Nome) {
        return produtoGateway.getProdutoByNome(Nome);
    }
}