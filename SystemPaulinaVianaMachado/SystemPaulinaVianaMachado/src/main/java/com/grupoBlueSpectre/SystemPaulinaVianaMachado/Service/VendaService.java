package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Model.VendaModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Repository.VendaRepository;

@Service
public class VendaService {
    @Autowired
    private VendaRepository vendaRepository;
    
    public List<VendaModel> getAllVendas(){
        return vendaRepository.findAll();
    }
    public Optional<VendaModel> getVendasByID(Integer id){
        return vendaRepository.findById(id);
    }
    public VendaModel newVenda(VendaModel venda){
        return vendaRepository.save(venda);
    }
    public void deleteVenda(Integer id){
        vendaRepository.deleteById(id);
    }
    public VendaModel updateVenda(VendaModel venda , Integer id){
            deleteVenda(venda.getIdVenda());
            newVenda(venda);
            venda.setIdVenda(id);
            return venda;
    }
}
