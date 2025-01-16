package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Fornecedor;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.FornecedorDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.FornecedorGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.CriarUseCase;

public class CriarFornecedorUseCaseImpl implements CriarUseCase<FornecedorDomain>{

    private final FornecedorGateway fornecedorGateway;

    public CriarFornecedorUseCaseImpl(FornecedorGateway fornecedorGateway){
        this.fornecedorGateway = fornecedorGateway;
    }
    @Override
    public FornecedorDomain execute(FornecedorDomain fornecedor) {
        return fornecedorGateway.newFornecedor(fornecedor);
    }
}