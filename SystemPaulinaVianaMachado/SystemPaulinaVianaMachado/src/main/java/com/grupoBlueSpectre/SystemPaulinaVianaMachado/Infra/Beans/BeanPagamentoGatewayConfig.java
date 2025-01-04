package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Beans;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.PagamentoModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.PagamentoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Debito.BuscarDebitoPorIDUseCaseImpl;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.*;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Pagamento.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanPagamentoGatewayConfig {
    @Bean
    public AlterarUserCase<PagamentoModel> alterarPagamento(PagamentoGateway pagamentoGateway){
        return new AlterarPagamentoUseCaseImpl(pagamentoGateway);
    }
    @Bean
    public BuscarPorDataUseCase<PagamentoModel> buscarPagamentoPorData(PagamentoGateway pagamentoGateway){
        return new BuscarPagamentoPorDataUseCaseImpl(pagamentoGateway);
    }
    @Bean
    public BuscarUseCase<PagamentoModel> buscarPagamento(PagamentoGateway pagamentoGateway){
        return new BuscarPagamentoUseCaseImpl(pagamentoGateway);
    }
    @Bean
    public BuscarPorIDUserCase<PagamentoModel> buscarPagamentoPorID(PagamentoGateway pagamentoGateway){
        return new BuscarPagamentoPorIDUseCaseImpl(pagamentoGateway);
    }
    @Bean
    public CriarUseCase<PagamentoModel> CriarPagamento(PagamentoGateway pagamentoGateway){
        return new CriarPagamentoUseCaseImpl(pagamentoGateway);
    }
    @Bean
    public DeleteUsecase deleteUsecase(PagamentoGateway pagamentoGateway){
        return new DeletePagamentoUseCaseImpl(pagamentoGateway);
    }
}