package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Fornecedor;

import java.util.Optional;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.FornecedorModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.FornecedorGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.BuscarPorNomeUseCase;

public class BuscarFornecedorPorNomeUseCaseImpl implements BuscarPorNomeUseCase<FornecedorModel>{

    private final FornecedorGateway fornecedorGateway;

    public BuscarFornecedorPorNomeUseCaseImpl(FornecedorGateway fornecedorGateway){
        this.fornecedorGateway = fornecedorGateway;
    }
    @Override
    public Optional<FornecedorModel> execute(String Nome) {
        return fornecedorGateway.getForncedorByName(Nome);
    }
}