package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Gateway;

import java.util.List;
import java.util.Optional;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.FornecedorDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.FornecedorGateway;

public class FornecedorInfraGateway implements FornecedorGateway{

    @Override
    public Optional<FornecedorDomain> getFornecedorByID(Long ID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFornecedorByID'");
    }
 
    @Override
    public Optional<FornecedorDomain> getForncedorByName(String nome) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getForncedorByName'");
    }

    @Override
    public List<FornecedorDomain> getFornecedores() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFornecedores'");
    }

    @Override
    public FornecedorDomain newFornecedor(FornecedorDomain fornecedor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'newFornecedor'");
    }

    @Override
    public Void deleteFornecedor(Long ID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteFornecedor'");
    }

    @Override
    public FornecedorDomain alterarFornecedor(Long ID, FornecedorDomain fornecedor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alterarFornecedor'");
    }   
}