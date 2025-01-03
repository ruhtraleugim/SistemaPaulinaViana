package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.RelatorioModel;


public interface RelatorioGateway {

        Optional<RelatorioModel> getRelatorioByID(int ID);

        List<RelatorioModel> getRelatorio();

        List<RelatorioModel> getRelatorioByDate(Date date);

        void deleteRelatorio(int ID);

        RelatorioModel newRelatorio(RelatorioModel relatorio);

        RelatorioModel alterarRelatorio(int ID, RelatorioModel relatorio);
} 
