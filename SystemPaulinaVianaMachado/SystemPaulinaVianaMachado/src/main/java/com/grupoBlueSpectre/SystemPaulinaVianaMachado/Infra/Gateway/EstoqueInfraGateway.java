package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Gateway;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.EstoqueDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.EstoqueGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.Estoque.EstoqueMapper;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.EstoquePersistence;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.Entities.EstoqueEntity;

@Service
public class EstoqueInfraGateway implements EstoqueGateway{

    private final EstoquePersistence estoqueRepository;
    private final EstoqueMapper estoqueMapper;

    public EstoqueInfraGateway(EstoquePersistence estoqueRepository ,EstoqueMapper estoqueMapper) {
        this.estoqueRepository = estoqueRepository;
        this.estoqueMapper = estoqueMapper;
    }
    @Override
    public Optional<EstoqueDomain> getEstoqueByID(Long ID) {
        return estoqueRepository.findById(ID).map(estoqueMapper::entityToDomain);
    }
    @Override
    public List<EstoqueDomain> getEstoques() {
        return estoqueRepository.findAll().stream().map(estoqueMapper::entityToDomain).toList();
    }
    @Override
    public List<EstoqueDomain> getEstoqueByDate(LocalDate date) {
        return estoqueRepository.findByDataEstoque(date).stream().map(estoqueMapper::entityToDomain).toList();
    }
    @Override
    public void deletarEstoque(Long ID) {
        estoqueRepository.deleteById(ID);
    }
    @Override
    public EstoqueDomain criarEstoque(EstoqueDomain estoqueModel) {
        EstoqueEntity entity = estoqueMapper.toEntity(estoqueModel);
        EstoqueEntity savedEntity = estoqueRepository.save(entity);
        return estoqueMapper.entityToDomain(savedEntity);
    }
    @Override
    public EstoqueDomain updateEstoque(EstoqueDomain estoque, Long iD) {
        EstoqueEntity entity = estoqueMapper.toEntity(estoque);
        estoqueRepository.updadeEstoque(entity, iD);
        return estoqueMapper.entityToDomain(entity);
    }
}