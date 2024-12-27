package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway;

import java.util.List;
import java.util.Optional;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.FornecedorModel;

public interface FornecedorGateway {
    
        Optional<FornecedorModel> getFornecedorByID();

        List<FornecedorModel> getFornecedores();

        FornecedorModel newFornecedor(FornecedorModel fornecedor);

        Void deleteFornecedor(int ID);
        
        FornecedorModel alterarFornecedor(int ID, FornecedorModel fornecedor);
}
