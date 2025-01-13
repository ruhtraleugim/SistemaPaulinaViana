package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway;

import java.util.List;
import java.util.Optional;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.FornecedorDomain;

public interface FornecedorGateway {
    
        Optional<FornecedorDomain> getFornecedorByID(int ID);

        Optional<FornecedorDomain> getForncedorByName(String nome);

        List<FornecedorDomain> getFornecedores();

        FornecedorDomain newFornecedor(FornecedorDomain fornecedor);

        Void deleteFornecedor(int ID);
        
        FornecedorDomain alterarFornecedor(int ID, FornecedorDomain fornecedor);
}
