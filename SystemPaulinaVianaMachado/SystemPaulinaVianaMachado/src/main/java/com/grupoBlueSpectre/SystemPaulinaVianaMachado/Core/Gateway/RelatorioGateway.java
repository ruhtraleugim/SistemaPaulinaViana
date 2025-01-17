package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.RelatorioDomain;


public interface RelatorioGateway {

        Optional<RelatorioDomain> getRelatorioByID(int ID);

        List<RelatorioDomain> getRelatorio();

        List<RelatorioDomain> getRelatorioByDate(Date date);

        void deleteRelatorio(int ID);

        RelatorioDomain newRelatorio(RelatorioDomain relatorio);

        RelatorioDomain alterarRelatorio(int ID, RelatorioDomain relatorio);
} 
