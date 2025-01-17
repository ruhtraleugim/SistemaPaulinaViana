package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Produto;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.ProdutoDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.ProdutoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.AlterarUserCase;

public class AlterarProdutoUseCaseImpl implements AlterarUserCase<ProdutoDomain> {

    private final ProdutoGateway produtoGateway;

    public AlterarProdutoUseCaseImpl(ProdutoGateway produtoGateway){
        this.produtoGateway = produtoGateway;
    }
    @Override
    public ProdutoDomain execute(Long ID, ProdutoDomain newProduto) {
       return produtoGateway.alterarProduto(newProduto, ID);
    }
}