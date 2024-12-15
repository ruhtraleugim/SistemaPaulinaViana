package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.Indexer;
import org.springframework.stereotype.Service;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Model.RelatorioModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Model.VendaModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Repository.RelatorioRepository;

@Service
public class RelatorioService {
    @Autowired
    private RelatorioRepository relatorioRepository;

    public List<RelatorioModel> getAllRelatorios(){
        return relatorioRepository.findAll();
    }
    public Optional<RelatorioModel> getRelatorioById(Integer id){
        return relatorioRepository.findById(id);
    }
    public RelatorioModel newRelatorio(RelatorioModel relatorio){
        return relatorioRepository.save(relatorio);
    }
    public void deleteRelatorio(Integer id){
        relatorioRepository.deleteById(id);
    }//corrigir o updaterelatorio
    public RelatorioModel updateRelatorio(RelatorioModel relatorio , Integer id){
            deleteRelatorio(relatorio.getIdRelatorio());
            newRelatorio(relatorio);
            relatorio.setIdRelatorio(id);
            return relatorio;
    }
}
