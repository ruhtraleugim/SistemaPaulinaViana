package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Gateway;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.VendaDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.VendaGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.Venda.VendaMapper;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.VendaPersistence;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.Entities.VendaEntity;

public class VendaInfraGateway implements VendaGateway{
    
    private final VendaPersistence vendaRepository;
    private final VendaMapper vendaMapper ;

    public VendaInfraGateway(VendaPersistence vendaRepository ,VendaMapper vendaMapper) {
        this.vendaRepository = vendaRepository;
        this.vendaMapper = vendaMapper;
    }
    @Override
    public Optional<VendaDomain> getVendaByID(Long id) {
        return vendaRepository.findById(id).map(vendaMapper::entityToDomain);
    }
    @Override
    public List<VendaDomain> getVendasByDate(Date Data) {
        return vendaRepository.findByDate(Data).stream().map(vendaMapper::entityToDomain).toList();
    }
    @Override
    public List<VendaDomain> getVendas() {
        return vendaRepository.findAll().stream().map(vendaMapper::entityToDomain).toList();
    }
    @Override
    public void deleteVenda(Long id) {
        vendaRepository.deleteById(id);
    }
    @Override
    public VendaDomain newVenda(VendaDomain venda) {
        VendaEntity vendaEntity = vendaMapper.toEntity(venda);
        VendaEntity savedEntity = vendaRepository.save(vendaEntity);
        return vendaMapper.entityToDomain(savedEntity);
    }
    @Override
    public VendaDomain alterarVenda(VendaDomain venda, Long ID) {
        VendaEntity relatorioEntity = vendaMapper.toEntity(venda);
        vendaRepository.updateVenda(relatorioEntity, ID);
        return vendaMapper.entityToDomain(relatorioEntity);
    }   
}