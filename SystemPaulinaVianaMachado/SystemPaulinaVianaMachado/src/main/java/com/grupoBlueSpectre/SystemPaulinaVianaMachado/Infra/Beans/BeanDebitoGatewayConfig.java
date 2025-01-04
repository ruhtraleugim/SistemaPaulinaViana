package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Beans;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.DebitoModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.DebitoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Debito.*;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanDebitoGatewayConfig {
    @Bean
    public AlterarUserCase<DebitoModel> alterarDebito(DebitoGateway debitoGateway){
        return new AlterarDebitoUseCaseImpl(debitoGateway);
    }
    @Bean
    public BuscarPorDataUseCase<DebitoModel> buscarDebitoPorData(DebitoGateway debitoGateway){
        return new BuscarDebitoPorDataUseCaseImpl(debitoGateway);
    }
    @Bean
    public BuscarPorIDUserCase<DebitoModel> buscarDebitoPorID(DebitoGateway debitoGateway){
        return new BuscarDebitoPorIDUseCaseImpl(debitoGateway);
    }
    @Bean
    public BuscarUseCase<DebitoModel> buscarDebito(DebitoGateway debitoGateway){
        return new BuscarDebitoUseCaseImpl(debitoGateway);
    }
    @Bean
    public CriarUseCase<DebitoModel> criarDebito(DebitoGateway debitoGateway) {
        return new CriarDebitoUseCaseImpl(debitoGateway);
    }
    @Bean
    public  DeleteUsecase deleteDebito(DebitoGateway debitoGateway){
        return new DeleteDebitoUseCaseImpl(debitoGateway);
    }
}