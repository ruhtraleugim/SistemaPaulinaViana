package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Produto;

import java.util.List;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.ProdutoModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.ProdutoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.BuscarUseCase;

public class BuscarProtutoUseCaseImpl implements BuscarUseCase<ProdutoModel> {
    
    private ProdutoGateway produtoGateway;

    public BuscarProtutoUseCaseImpl(ProdutoGateway produtoGateway){
        this.produtoGateway = produtoGateway;
    }
    @Override
    public List<ProdutoModel> execute() {
        return produtoGateway.getProduto();
    }
}