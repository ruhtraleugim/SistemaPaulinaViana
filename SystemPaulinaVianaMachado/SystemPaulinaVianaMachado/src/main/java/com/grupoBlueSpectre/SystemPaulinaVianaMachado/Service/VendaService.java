package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Model.VendaModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Repository.VendaRepository;

@Service
public class VendaService {
    @Autowired
    private VendaRepository vendaRepository;
    
    public List<VendaModel> GetAll(){
        return vendaRepository.findAll();
    }


    public int numb(){
        return 1+1 ;
    }
}
