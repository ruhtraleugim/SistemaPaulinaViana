package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Relatorio;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.RelatorioGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.DeleteUsecase;

public class DeleteRelatorioUseCaseImpl implements DeleteUsecase {

    private final RelatorioGateway relatorioGateway;

    public DeleteRelatorioUseCaseImpl(RelatorioGateway relatorioGateway){
        this.relatorioGateway = relatorioGateway;
    }
    @Override
    public void execute(Long ID) {
       relatorioGateway.deleteRelatorio(ID);
    }
    
}