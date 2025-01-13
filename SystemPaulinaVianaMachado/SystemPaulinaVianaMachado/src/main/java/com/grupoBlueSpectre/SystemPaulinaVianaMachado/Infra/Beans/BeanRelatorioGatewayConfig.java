package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.RelatorioDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.RelatorioGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.AlterarUserCase;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.BuscarPorDataUseCase;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.BuscarUseCase;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.CriarUseCase;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.DeleteUsecase;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Relatorio.AlterarRelatorioUseCaseImpl;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Relatorio.BuscarRelatorioPorDataUseCaseImpl;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Relatorio.BuscarRelatorioUseCaseImpl;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Relatorio.CriarRelatorioUseCaseImpl;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Relatorio.DeleteRelatorioUseCaseImpl;

@Configuration
public class BeanRelatorioGatewayConfig {
    @Bean
    public AlterarUserCase<RelatorioDomain> alterarRelatorio(RelatorioGateway relatorioGateway){
        return new AlterarRelatorioUseCaseImpl(relatorioGateway);
    }
    @Bean
    public BuscarPorDataUseCase<RelatorioDomain> buscarRelatorioPorData(RelatorioGateway relatorioGateway){
        return new BuscarRelatorioPorDataUseCaseImpl(relatorioGateway);
    }
    @Bean
    public BuscarUseCase<RelatorioDomain> buscarPagamento(RelatorioGateway relatorioGateway){
        return new BuscarRelatorioUseCaseImpl(relatorioGateway);
    }
    @Bean
    public CriarUseCase<RelatorioDomain> criarRelatorio(RelatorioGateway relatorioGateway) {
        return new CriarRelatorioUseCaseImpl(relatorioGateway);
    }
    @Bean
    public  DeleteUsecase deleteRelatorio(RelatorioGateway relatorioGateway){
        return new DeleteRelatorioUseCaseImpl(relatorioGateway);
    }
}