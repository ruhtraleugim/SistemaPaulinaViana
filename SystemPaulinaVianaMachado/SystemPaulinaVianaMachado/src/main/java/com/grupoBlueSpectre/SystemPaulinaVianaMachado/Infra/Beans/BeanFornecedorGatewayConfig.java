package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Beans;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.FornecedorModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.FornecedorGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Fornecedor.*;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanFornecedorGatewayConfig {
    @Bean
    public AlterarUserCase<FornecedorModel> alterarFornecedor(FornecedorGateway fornecedorGateway){
        return new AlterarFornecedorUseCaseImpl(fornecedorGateway);
    }
    @Bean
    public BuscarPorIDUserCase<FornecedorModel> buscarFornecedorPorID(FornecedorGateway fornecedorGateway){
        return new BuscarFonecedorPoIDUseCaseImpl(fornecedorGateway);
    }
    @Bean
    public BuscarPorNomeUseCase<FornecedorModel> buscarFornecedorPorNome(FornecedorGateway fornecedorGateway){
        return new BuscarFornecedorPorNomeUseCaseImpl(fornecedorGateway);
    }
    @Bean
    public BuscarUseCase<FornecedorModel> buscarUseCase(FornecedorGateway fornecedorGateway){
        return new BuscarFornecedorUseCaseImpl(fornecedorGateway);
    }
    @Bean
    public CriarUseCase<FornecedorModel> criarFornecedor(FornecedorGateway fornecedorGateway){
        return new CriarFornecedorUseCaseImpl(fornecedorGateway);
    }
    @Bean
    public DeleteUsecase deleteFornecedor(FornecedorGateway fornecedorGateway){
        return new DeletarFornecedorUseCaseImpl(fornecedorGateway);
    }
}