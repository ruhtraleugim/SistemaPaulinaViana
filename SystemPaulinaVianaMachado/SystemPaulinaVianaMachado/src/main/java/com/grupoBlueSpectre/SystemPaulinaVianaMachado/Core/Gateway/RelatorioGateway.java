package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.RelatorioDomain;


public interface RelatorioGateway {

        Optional<RelatorioDomain> getRelatorioByID(Long ID);

        List<RelatorioDomain> getRelatorio();

        List<RelatorioDomain> getRelatorioByDate(Date date);

        void deleteRelatorio(Long ID);

        RelatorioDomain newRelatorio(RelatorioDomain relatorio);

        RelatorioDomain alterarRelatorio(Long ID, RelatorioDomain relatorio);
} 
