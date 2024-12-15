package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Model.EstoqueModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Repository.EstoqueRepository;

@Service
public class EstoqueService {
    @Autowired
    private EstoqueRepository estoqueRepository;

    public List<EstoqueModel> getAllEstoques(){
        return estoqueRepository.findAll();
    }
    public Optional<EstoqueModel> getEstoqueByID(Integer id){
        return estoqueRepository.findById(id);
    }
    public EstoqueModel newEstoque(EstoqueModel estoque){
        return estoqueRepository.save(estoque);
    }
    public void deleteEstoque(Integer id){
        estoqueRepository.deleteById(id);
    }//update, corrigir
    public EstoqueModel updateEstoque(EstoqueModel estoque , Integer id){
            deleteEstoque(estoque.getIdEstoque());
            newEstoque(estoque);
            estoque.setIdEstoque(id);
            return estoque;
    }
}
