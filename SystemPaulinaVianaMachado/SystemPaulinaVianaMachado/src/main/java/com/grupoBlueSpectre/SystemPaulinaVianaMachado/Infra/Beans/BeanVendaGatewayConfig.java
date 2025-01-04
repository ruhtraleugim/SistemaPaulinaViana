package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity.VendaModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.VendaGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.AlterarUserCase;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.BuscarPorDataUseCase;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.BuscarPorIDUserCase;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.BuscarUseCase;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.CriarUseCase;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.DeleteUsecase;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Venda.AlterarVendaUseCaseImpl;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Venda.BuscarVendaPorDiaUseCaseImpl;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Venda.BuscarVendaPorIDUseCaseImpl;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Venda.BuscarVendaUseCaseImpl;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Venda.CriarVendaUseCaseImpl;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Venda.DeleteVendaUseCaseImpl;

@Configuration
public class BeanVendaGatewayConfig {
    @Bean
    public AlterarUserCase<VendaModel> alterarVenda(VendaGateway vendaGateway) {
        return new AlterarVendaUseCaseImpl(vendaGateway);
    }
    @Bean
    public BuscarPorDataUseCase<VendaModel> buscarVendaPorDia(VendaGateway vendaGateway) {
        return new BuscarVendaPorDiaUseCaseImpl(vendaGateway);
    }
    @Bean
    public BuscarPorIDUserCase<VendaModel> buscarVendaPorID(VendaGateway vendaGateway) {
        return new BuscarVendaPorIDUseCaseImpl(vendaGateway);
    }
    @Bean
    public BuscarUseCase<VendaModel> buscarVenda(VendaGateway vendaGateway) {
        return new BuscarVendaUseCaseImpl(vendaGateway);
    }
    @Bean
    public CriarUseCase<VendaModel> criarVenda(VendaGateway vendaGateway) {
        return new CriarVendaUseCaseImpl(vendaGateway);
    }
    @Bean
    public DeleteUsecase deleteVenda(VendaGateway vendaGateway) {
        return new DeleteVendaUseCaseImpl(vendaGateway);
    }
}