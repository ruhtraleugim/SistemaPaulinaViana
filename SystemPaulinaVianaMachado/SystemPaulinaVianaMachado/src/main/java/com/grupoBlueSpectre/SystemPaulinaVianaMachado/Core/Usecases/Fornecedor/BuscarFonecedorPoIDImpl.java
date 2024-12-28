package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Fornecedor;

import java.util.Optional;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.FornecedorModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.FornecedorGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.BuscarPorIDUserCase;

public class BuscarFonecedorPoIDImpl implements BuscarPorIDUserCase<FornecedorModel>{

    private final FornecedorGateway fornecedorGateway;

    public BuscarFonecedorPoIDImpl(FornecedorGateway fornecedorGateway){
        this.fornecedorGateway = fornecedorGateway;
    }
    @Override
    public Optional<FornecedorModel> execute(int ID) {
        return fornecedorGateway.getFornecedorByID(ID);
    }
} 
