package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Fornecedor;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.FornecedorGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.DeleteUsecase;

public class DeletarFornecedorImpl implements DeleteUsecase {

    private final FornecedorGateway fornecedorGateway;

    public DeletarFornecedorImpl(FornecedorGateway fornecedorGateway){
        this.fornecedorGateway = fornecedorGateway;
    }
    @Override
    public void execute(int ID) {
        fornecedorGateway.deleteFornecedor(ID);
    }
    
}
