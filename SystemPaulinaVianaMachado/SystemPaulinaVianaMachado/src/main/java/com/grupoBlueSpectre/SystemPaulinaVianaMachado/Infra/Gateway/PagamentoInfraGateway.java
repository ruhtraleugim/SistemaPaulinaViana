package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Gateway;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.PagamentoDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.PagamentoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.Pagamento.PagamentoMapper;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.PagamentoPersistence;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.Entities.PagamentoEntity;

@Service
public class PagamentoInfraGateway implements PagamentoGateway {

    private final PagamentoPersistence pagamentoRepository;
    private final PagamentoMapper pagamentoMapper;

    public PagamentoInfraGateway(PagamentoPersistence pagamentoRepository, PagamentoMapper pagamentoMapper) {
        this.pagamentoRepository = pagamentoRepository;
        this.pagamentoMapper = pagamentoMapper;
    }
    @Override
    public Optional<PagamentoDomain> getPagamentoByID(Long ID) {
        return pagamentoRepository.findById(ID).map(pagamentoMapper::entityToDomain);
    }
    @Override
    public List<PagamentoDomain> getPagamentos() {
        return pagamentoRepository.findAll().stream().map(pagamentoMapper::entityToDomain).toList();
    }
    @Override
    public List<PagamentoDomain> getPagamentoByDate(LocalDate date) {
        return pagamentoRepository.findByDataPagamento(date).stream().map(pagamentoMapper::entityToDomain).toList();
    }
    @Override
    public PagamentoDomain newPagamentoModel(PagamentoDomain pagamento) {
        PagamentoEntity pagamentoEntity = pagamentoMapper.toEntity(pagamento);
        PagamentoEntity savedEntity = pagamentoRepository.save(pagamentoEntity);
        return pagamentoMapper.entityToDomain(savedEntity);
    }
    @Override
    public PagamentoDomain alterarPagamentoModel(Long ID, PagamentoDomain pagamento) {
        PagamentoEntity pagamentoEntity = pagamentoMapper.toEntity(pagamento);
        pagamentoRepository.updatePagamento(pagamentoEntity, ID);
        return pagamentoMapper.entityToDomain(pagamentoEntity);
    }
    @Override
    public void deletePagamento(Long ID) {
        pagamentoRepository.deleteById(ID);
    }
}