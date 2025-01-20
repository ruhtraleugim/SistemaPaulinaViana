package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Gateway;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.RelatorioDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.RelatorioGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.Relatorio.RelatorioMapper;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.RelatorioPersistence;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.Entities.RelatorioEntity;

@Service
public class RelatorioInfraGateway implements RelatorioGateway{

    private final RelatorioPersistence relatorioRepository;
    private final RelatorioMapper relatorioMapper;

    public RelatorioInfraGateway(RelatorioPersistence relatorioRepository ,RelatorioMapper relatorioMapper) {
        this.relatorioRepository = relatorioRepository;
        this.relatorioMapper = relatorioMapper;
    }
    @Override
    public Optional<RelatorioDomain> getRelatorioByID(Long ID) {
        return relatorioRepository.findById(ID).map(relatorioMapper::entityToDomain);
    }
    @Override
    public List<RelatorioDomain> getRelatorio() {
        return relatorioRepository.findAll().stream().map(relatorioMapper::entityToDomain).toList();   
    }
    @Override
    public List<RelatorioDomain> getRelatorioByDate(LocalDate date) {
        return relatorioRepository.findByDataHoraRelatorio(date).stream().map(relatorioMapper::entityToDomain).toList();
    }
    @Override
    public void deleteRelatorio(Long ID) {
        relatorioRepository.deleteById(ID);
    }
    @Override
    public RelatorioDomain newRelatorio(RelatorioDomain relatorio) {
        RelatorioEntity relatorioEntity = relatorioMapper.toEntity(relatorio);
        RelatorioEntity savedEntity = relatorioRepository.save(relatorioEntity);
        return relatorioMapper.entityToDomain(savedEntity);
    }
    @Override
    public RelatorioDomain alterarRelatorio(Long ID, RelatorioDomain relatorio) {
        RelatorioEntity relatorioEntity = relatorioMapper.toEntity(relatorio);
        relatorioRepository.updateRelatorio(relatorioEntity, ID);
        return relatorioMapper.entityToDomain(relatorioEntity);
    }
}