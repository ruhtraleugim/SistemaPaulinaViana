package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Fornecedor;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.FornecedorModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.FornecedorGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.CriarUseCase;

public class CriarFornecedorImpl implements CriarUseCase<FornecedorModel>{

    private final FornecedorGateway fornecedorGateway;

    public CriarFornecedorImpl(FornecedorGateway fornecedorGateway){
        this.fornecedorGateway = fornecedorGateway;
    }
    @Override
    public FornecedorModel execute(FornecedorModel fornecedor) {
        return fornecedorGateway.newFornecedor(fornecedor);
    }
}
