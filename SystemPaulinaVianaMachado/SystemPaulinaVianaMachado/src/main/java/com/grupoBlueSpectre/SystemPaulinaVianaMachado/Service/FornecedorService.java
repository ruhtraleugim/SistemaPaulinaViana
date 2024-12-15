package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Model.FornecedorModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Repository.FornecedorRepository;

@Service
public class FornecedorService {
    @Autowired
    private FornecedorRepository fornecedorRepository;

    public List<FornecedorModel> getAllFornecedores(){
        return fornecedorRepository.findAll();
    }
    public Optional<FornecedorModel> getFornecedorById(Integer id){
        return fornecedorRepository.findById(id);
    }
    public FornecedorModel newFornecedor(FornecedorModel fornecedor){
        return fornecedorRepository.save(fornecedor);
    }
    public void deleteFornecedor(Integer id){
        fornecedorRepository.deleteById(id);
    }//corrigir o updatefornecedor
    public FornecedorModel updatFornecedor(FornecedorModel fornecedor , Integer id){
        deleteFornecedor(fornecedor.getIdFornecedor());
        newFornecedor(fornecedor);
        fornecedor.setIdFornecedor(id);
        return fornecedor;
    }
}
