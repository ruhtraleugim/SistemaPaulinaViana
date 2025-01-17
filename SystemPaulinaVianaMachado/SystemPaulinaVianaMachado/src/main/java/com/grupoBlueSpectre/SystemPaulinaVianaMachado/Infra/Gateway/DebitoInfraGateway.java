package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Gateway;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.DebitoDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.DebitoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Entities.DebitoEntity;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.Debito.DebitoMapper;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.DebitoPersistence;

public class DebitoInfraGateway implements DebitoGateway {

    private final DebitoPersistence debitoRepository;
    private final DebitoMapper debitoMapper;

    public DebitoInfraGateway(DebitoPersistence debitoRepository, DebitoMapper debitoMapper) {
        this.debitoRepository = debitoRepository;
        this.debitoMapper = debitoMapper;
    }
    @Override
    public DebitoDomain newDebito(DebitoDomain debito) {
        DebitoEntity entity = debitoMapper.toEntity(debito);
        DebitoEntity savedEntity = debitoRepository.save(entity);
        return  debitoMapper.entityToDomain(savedEntity);
    }
    @Override
    public List<DebitoDomain> GetDebito() {
        return debitoRepository.findAll().stream().map(debitoMapper::entityToDomain).toList();
    }
    @Override
    public List<DebitoDomain> getDebitosByDate(Date date) {
        return debitoRepository.findByDataDebito(date).stream().map(debitoMapper::entityToDomain).toList();
    }
    @Override
    public void deleteDebito(Long ID) {
        debitoRepository.deleteById( ID);
    }
    @Override
    public Optional<DebitoDomain> getDebitosByID(Long ID) {
        return debitoRepository.findById(ID).map(debitoMapper::entityToDomain);
    }
}