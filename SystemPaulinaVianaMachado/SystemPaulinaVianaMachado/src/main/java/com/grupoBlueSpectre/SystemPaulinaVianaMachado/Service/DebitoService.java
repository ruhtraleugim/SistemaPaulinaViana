package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Model.DebitosModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Repository.DebitosRepository;

@Service
public class DebitoService {
    @Autowired
    private DebitosRepository debitoRepository;

    public List<DebitosModel> getAllDebitos(){
        return debitoRepository.findAll();
    }
    public Optional<DebitosModel> getDebitoByID(Integer id){
        return debitoRepository.findById(id);
    }//lembrar de tirar o "s" no DebitosModel
    public DebitosModel newDebitosModel(DebitosModel debito){
        return debitoRepository.save(debito);
    }
    public void deleteDebito(Integer id){
        debitoRepository.deleteById(id);
    }
        public DebitosModel updateVenda(DebitosModel venda , Integer id){
            return venda;
    }
}



