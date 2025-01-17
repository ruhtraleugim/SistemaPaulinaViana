package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Relatorio;

import java.util.Date;
import java.util.List;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.RelatorioDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.RelatorioGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.BuscarPorDataUseCase;

public class BuscarRelatorioPorDataUseCaseImpl implements BuscarPorDataUseCase<RelatorioDomain>{

    private final RelatorioGateway relatorioGateway;

    public BuscarRelatorioPorDataUseCaseImpl(RelatorioGateway relatorioGateway){
        this.relatorioGateway = relatorioGateway;
    }
    @Override
    public List<RelatorioDomain> execute(Date date) {
        return relatorioGateway.getRelatorioByDate(date);
    } 
}