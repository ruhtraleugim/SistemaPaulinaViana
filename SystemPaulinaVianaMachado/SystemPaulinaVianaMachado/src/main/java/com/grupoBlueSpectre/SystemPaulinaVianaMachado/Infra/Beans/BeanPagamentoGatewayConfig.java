package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Beans;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.PagamentoDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.PagamentoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.*;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Pagamento.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanPagamentoGatewayConfig {
    @Bean
    public AlterarUserCase<PagamentoDomain> alterarPagamento(PagamentoGateway pagamentoGateway){
        return new AlterarPagamentoUseCaseImpl(pagamentoGateway);
    }
    @Bean
    public BuscarPorDataUseCase<PagamentoDomain> buscarPagamentoPorData(PagamentoGateway pagamentoGateway){
        return new BuscarPagamentoPorDataUseCaseImpl(pagamentoGateway);
    }
    @Bean
    public BuscarUseCase<PagamentoDomain> buscarPagamento(PagamentoGateway pagamentoGateway){
        return new BuscarPagamentoUseCaseImpl(pagamentoGateway);
    }
    @Bean
    public BuscarPorIDUserCase<PagamentoDomain> buscarPagamentoPorID(PagamentoGateway pagamentoGateway){
        return new BuscarPagamentoPorIDUseCaseImpl(pagamentoGateway);
    }
    @Bean
    public CriarUseCase<PagamentoDomain> CriarPagamento(PagamentoGateway pagamentoGateway){
        return new CriarPagamentoUseCaseImpl(pagamentoGateway);
    }
    @Bean
    public DeleteUsecase deleteUsecase(PagamentoGateway pagamentoGateway){
        return new DeletePagamentoUseCaseImpl(pagamentoGateway);
    }
}