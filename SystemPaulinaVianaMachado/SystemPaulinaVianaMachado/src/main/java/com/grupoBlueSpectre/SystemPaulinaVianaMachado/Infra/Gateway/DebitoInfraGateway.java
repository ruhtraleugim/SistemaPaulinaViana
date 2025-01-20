package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Gateway;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.DebitoDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.DebitoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.Debito.DebitoMapper;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.DebitoPersistence;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.Entities.DebitoEntity;

@Service
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
    public List<DebitoDomain> getDebitosByDate(LocalDate date) {
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
    @Override
    public DebitoDomain AlterarDebito(DebitoDomain debito, Long ID) {
        DebitoEntity entity = debitoMapper.toEntity(debito);
        debitoRepository.updateDebito(entity, ID);
        return debitoMapper.entityToDomain(entity);
    }
}