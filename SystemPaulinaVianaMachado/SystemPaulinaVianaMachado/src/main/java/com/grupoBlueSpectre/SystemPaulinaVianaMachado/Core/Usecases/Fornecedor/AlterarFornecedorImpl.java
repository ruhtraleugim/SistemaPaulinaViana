package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Fornecedor;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.FornecedorModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.FornecedorGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.AlterarUserCase;

public class AlterarFornecedorImpl implements AlterarUserCase<FornecedorModel>{

    private final FornecedorGateway fornecedorGateway;

    public AlterarFornecedorImpl(FornecedorGateway fornecedorGateway){
        this.fornecedorGateway = fornecedorGateway;
    }
    @Override
    public FornecedorModel execute(int ID, FornecedorModel fornecedor) {
        return fornecedorGateway.alterarFornecedor(ID, fornecedor);
    }
}