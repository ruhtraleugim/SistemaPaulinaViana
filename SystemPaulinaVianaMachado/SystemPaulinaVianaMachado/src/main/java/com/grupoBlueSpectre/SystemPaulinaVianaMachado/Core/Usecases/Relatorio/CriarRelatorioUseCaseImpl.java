package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Relatorio;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.RelatorioDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.RelatorioGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.CriarUseCase;

public class CriarRelatorioUseCaseImpl implements CriarUseCase<RelatorioDomain> {

    private final RelatorioGateway relatorioGateway;

    public CriarRelatorioUseCaseImpl(RelatorioGateway relatorioGateway){
        this.relatorioGateway = relatorioGateway;
    }
    @Override
    public RelatorioDomain execute(RelatorioDomain relatorio) {
        return relatorioGateway.newRelatorio(relatorio);
    }
}