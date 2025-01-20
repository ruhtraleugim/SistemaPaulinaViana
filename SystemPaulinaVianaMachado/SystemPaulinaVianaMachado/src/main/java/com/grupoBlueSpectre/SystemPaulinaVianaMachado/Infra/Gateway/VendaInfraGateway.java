package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Gateway;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.VendaDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.VendaGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.Venda.VendaMapper;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.VendaPersistence;

public class VendaInfraGateway implements VendaGateway{
    
    private final VendaPersistence vendaRepository;
    private final VendaMapper vendaMapper ;

    public VendaInfraGateway(VendaPersistence vendaRepository ,VendaMapper vendaMapper) {
        this.vendaRepository = vendaRepository;
        this.vendaMapper = vendaMapper;
    }
    @Override
    public Optional<VendaDomain> getVendaByID(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getVendaByID'");
    }
    @Override
    public List<VendaDomain> getVendasByDate(Date Data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getVendasByDate'");
    }
    @Override
    public List<VendaDomain> getVendas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getVendas'");
    }
    @Override
    public void deleteVenda(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteVenda'");
    }
    @Override
    public VendaDomain newVenda(VendaDomain venda) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'newVenda'");
    }
    @Override
    public VendaDomain alterarVenda(VendaDomain venda, Long ID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alterarVenda'");
    }   
}
