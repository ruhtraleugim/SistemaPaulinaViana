package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Fornecedor;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.FornecedorGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.DeleteUsecase;

public class DeletarFornecedorUseCaseImpl implements DeleteUsecase {

    private final FornecedorGateway fornecedorGateway;

    public DeletarFornecedorUseCaseImpl(FornecedorGateway fornecedorGateway){
        this.fornecedorGateway = fornecedorGateway;
    }
    @Override
    public void execute(Long ID) {
        fornecedorGateway.deleteFornecedor(ID);
    }
    
}