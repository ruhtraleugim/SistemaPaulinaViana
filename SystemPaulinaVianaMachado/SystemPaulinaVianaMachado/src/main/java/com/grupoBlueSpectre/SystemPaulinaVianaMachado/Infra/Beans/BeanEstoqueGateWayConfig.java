package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Beans;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.EstoqueModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.EstoqueGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Estoque.*;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanEstoqueGateWayConfig {
    @Bean
    public AlterarUserCase<EstoqueModel> alterarEstoque(EstoqueGateway estoqueGateway){
        return new AlterarEstoqueUseCaseImpl(estoqueGateway);
    }
    @Bean
    public BuscarPorDataUseCase<EstoqueModel> buscarEstoquePorData(EstoqueGateway estoqueGateway){
        return new BuscarEstoquePorDataUseCaseImpl(estoqueGateway);
    }
    @Bean
    public BuscarUseCase<EstoqueModel> buscarEstoque(EstoqueGateway estoqueGateway){
        return new BuscarEstoqueUseCaseImpl(estoqueGateway);
    }
    @Bean
    public CriarUseCase<EstoqueModel> CriarEstoque(EstoqueGateway estoqueGateway){
        return new CriarEstoqueUseCaseImpl(estoqueGateway);
    }
    @Bean
    public DeleteUsecase deleteEstoque(EstoqueGateway estoqueGateway){
        return new DeleteEstoqueUseCaseImpl(estoqueGateway);
    }
}