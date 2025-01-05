package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Relatorio;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.RelatorioModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.RelatorioGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.AlterarUserCase;

public class AlterarRelatorioUseCaseImpl implements AlterarUserCase<RelatorioModel>{

    private final RelatorioGateway relatorioGateway;

    public AlterarRelatorioUseCaseImpl(RelatorioGateway relatorioGateway){
        this.relatorioGateway = relatorioGateway;
    }
    @Override
    public RelatorioModel execute(int ID, RelatorioModel relatorio) {
      return relatorioGateway.alterarRelatorio(ID, relatorio);
    }
}