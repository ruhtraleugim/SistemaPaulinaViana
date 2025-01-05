package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Relatorio;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.RelatorioModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.RelatorioGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.CriarUseCase;

public class CriarRelatorioUseCaseImpl implements CriarUseCase<RelatorioModel> {

    private final RelatorioGateway relatorioGateway;

    public CriarRelatorioUseCaseImpl(RelatorioGateway relatorioGateway){
        this.relatorioGateway = relatorioGateway;
    }
    @Override
    public RelatorioModel execute(RelatorioModel relatorio) {
        return relatorioGateway.newRelatorio(relatorio);
    }
}