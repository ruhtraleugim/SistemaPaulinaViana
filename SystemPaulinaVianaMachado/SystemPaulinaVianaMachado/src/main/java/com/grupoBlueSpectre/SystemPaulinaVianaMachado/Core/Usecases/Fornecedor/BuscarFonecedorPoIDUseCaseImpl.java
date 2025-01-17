package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Fornecedor;

import java.util.Optional;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.FornecedorDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.FornecedorGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.BuscarPorIDUserCase;

public class BuscarFonecedorPoIDUseCaseImpl implements BuscarPorIDUserCase<FornecedorDomain>{

    private final FornecedorGateway fornecedorGateway;

    public BuscarFonecedorPoIDUseCaseImpl(FornecedorGateway fornecedorGateway){
        this.fornecedorGateway = fornecedorGateway;
    }
    @Override
    public Optional<FornecedorDomain> execute(Long ID) {
        return fornecedorGateway.getFornecedorByID(ID);
    }
} 