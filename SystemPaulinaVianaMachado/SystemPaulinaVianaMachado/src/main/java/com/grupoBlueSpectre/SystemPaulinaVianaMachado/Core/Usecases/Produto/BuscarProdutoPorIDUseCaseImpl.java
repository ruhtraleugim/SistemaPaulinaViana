package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Produto;

import java.util.Optional;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.ProdutoModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.ProdutoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.BuscarPorIDUserCase;

public class BuscarProdutoPorIDUseCaseImpl implements BuscarPorIDUserCase<ProdutoModel>{

    private final ProdutoGateway produtoGateway;

    public BuscarProdutoPorIDUseCaseImpl(ProdutoGateway produtoGateway){
        this.produtoGateway = produtoGateway;
    }
    @Override
    public Optional<ProdutoModel> execute(int ID) {
        return produtoGateway.getProdutoByID(ID);
    }
}
