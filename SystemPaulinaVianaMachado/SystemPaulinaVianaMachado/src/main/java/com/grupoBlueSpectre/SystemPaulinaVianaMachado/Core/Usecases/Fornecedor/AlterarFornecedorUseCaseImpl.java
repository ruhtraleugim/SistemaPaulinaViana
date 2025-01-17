package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Fornecedor;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.FornecedorDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.FornecedorGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.AlterarUserCase;

public class AlterarFornecedorUseCaseImpl implements AlterarUserCase<FornecedorDomain>{

    private final FornecedorGateway fornecedorGateway;

    public AlterarFornecedorUseCaseImpl(FornecedorGateway fornecedorGateway){
        this.fornecedorGateway = fornecedorGateway;
    }
    @Override
    public FornecedorDomain execute(Long ID, FornecedorDomain fornecedor) {
        return fornecedorGateway.alterarFornecedor(ID, fornecedor);
    }
}