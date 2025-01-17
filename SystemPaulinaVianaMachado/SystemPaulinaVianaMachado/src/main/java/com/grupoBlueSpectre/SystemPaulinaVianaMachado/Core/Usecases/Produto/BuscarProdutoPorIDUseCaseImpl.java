package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Produto;

import java.util.Optional;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.ProdutoDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.ProdutoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.BuscarPorIDUserCase;

public class BuscarProdutoPorIDUseCaseImpl implements BuscarPorIDUserCase<ProdutoDomain>{

    private final ProdutoGateway produtoGateway;

    public BuscarProdutoPorIDUseCaseImpl(ProdutoGateway produtoGateway){
        this.produtoGateway = produtoGateway;
    }
    @Override
    public Optional<ProdutoDomain> execute(int ID) {
        return produtoGateway.getProdutoByID(ID);
    }
}