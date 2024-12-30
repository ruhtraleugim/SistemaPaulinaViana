package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Fornecedor;

import java.util.List;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.FornecedorModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.FornecedorGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.BuscarUseCase;

public class BuscarFornecedorUseCaseImpl implements BuscarUseCase<FornecedorModel> {

    private final FornecedorGateway fornecedorGateway;

    public BuscarFornecedorUseCaseImpl(FornecedorGateway fornecedorGateway){
        this.fornecedorGateway = fornecedorGateway;
    }
    @Override
    public List<FornecedorModel> execute() {
        return fornecedorGateway.getFornecedores();
    } 
}