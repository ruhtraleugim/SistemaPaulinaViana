package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Relatorio;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.RelatorioDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.RelatorioGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.AlterarUserCase;

public class AlterarRelatorioUseCaseImpl implements AlterarUserCase<RelatorioDomain>{

    private final RelatorioGateway relatorioGateway;

    public AlterarRelatorioUseCaseImpl(RelatorioGateway relatorioGateway){
        this.relatorioGateway = relatorioGateway;
    }
    @Override
    public RelatorioDomain execute(Long ID, RelatorioDomain relatorio) {
      return relatorioGateway.alterarRelatorio(ID, relatorio);
    }
}