package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Beans;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.FornecedorDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.FornecedorGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Fornecedor.*;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanFornecedorGatewayConfig {
    @Bean
    public AlterarUserCase<FornecedorDomain> alterarFornecedor(FornecedorGateway fornecedorGateway){
        return new AlterarFornecedorUseCaseImpl(fornecedorGateway);
    }
    @Bean
    public BuscarPorIDUserCase<FornecedorDomain> buscarFornecedorPorID(FornecedorGateway fornecedorGateway){
        return new BuscarFonecedorPoIDUseCaseImpl(fornecedorGateway);
    }
    @Bean
    public BuscarPorNomeUseCase<FornecedorDomain> buscarFornecedorPorNome(FornecedorGateway fornecedorGateway){
        return new BuscarFornecedorPorNomeUseCaseImpl(fornecedorGateway);
    }
    @Bean
    public BuscarUseCase<FornecedorDomain> buscarUseCase(FornecedorGateway fornecedorGateway){
        return new BuscarFornecedorUseCaseImpl(fornecedorGateway);
    }
    @Bean
    public CriarUseCase<FornecedorDomain> criarFornecedor(FornecedorGateway fornecedorGateway){
        return new CriarFornecedorUseCaseImpl(fornecedorGateway);
    }
    @Bean
    public DeleteUsecase deleteFornecedor(FornecedorGateway fornecedorGateway){
        return new DeletarFornecedorUseCaseImpl(fornecedorGateway);
    }
}