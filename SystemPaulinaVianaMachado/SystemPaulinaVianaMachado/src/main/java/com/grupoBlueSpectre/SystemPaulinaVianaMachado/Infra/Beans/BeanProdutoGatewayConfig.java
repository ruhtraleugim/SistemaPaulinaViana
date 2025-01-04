package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Beans;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.ProdutoModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.ProdutoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.*;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Produto.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanProdutoGatewayConfig {
    @Bean
    public AlterarUserCase<ProdutoModel> alterarProduto(ProdutoGateway produtoGateway){
        return new AlterarProdutoUseCaseImpl(produtoGateway);
    }
    @Bean
    public BuscarPorIDUserCase<ProdutoModel> buscarProdutoPorID(ProdutoGateway produtoGateway){
        return new BuscarProdutoPorIDUseCaseImpl(produtoGateway);
    }
    @Bean
    public BuscarUseCase<ProdutoModel> buscarProduto(ProdutoGateway produtoGateway){
        return new BuscarProdutoUseCaseImpl(produtoGateway);
    }
    @Bean
    public CriarUseCase<ProdutoModel> criarProduto(ProdutoGateway produtoGateway) {
        return new CriarProdutoUseCaseImpl(produtoGateway);
    }
    @Bean
    public  DeleteUsecase deleteProduto(ProdutoGateway produtoGateway){
        return new DeleteProdutoUseCaseImpl(produtoGateway);
    }
}
