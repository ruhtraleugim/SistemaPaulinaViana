package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Gateway;

import java.util.List;
import java.util.Optional;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.FornecedorDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.FornecedorGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.Fornecedor.FornecedorMapper;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.FornecedorPercistence;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.Entities.FornecedorEntity;

public class FornecedorInfraGateway implements FornecedorGateway{

    private final FornecedorPercistence fornecedorRepository;
    private final FornecedorMapper fornecedorMapper;

    public FornecedorInfraGateway(FornecedorPercistence fornecedorRepository, FornecedorMapper fornecedorMapper) {
        this.fornecedorRepository = fornecedorRepository;
        this.fornecedorMapper = fornecedorMapper;
    }
    @Override
    public Optional<FornecedorDomain> getFornecedorByID(Long ID) {
        return fornecedorRepository.findById(ID).map(fornecedorMapper::entityToDomain);
    }
    @Override
    public Optional<FornecedorDomain> getForncedorByName(String nome) {
        return fornecedorRepository.findByNome(nome).map(fornecedorMapper::entityToDomain);
    }
    @Override
    public List<FornecedorDomain> getFornecedores() {
        return fornecedorRepository.findAll().stream().map(fornecedorMapper::entityToDomain).toList();
    }
    @Override
    public FornecedorDomain newFornecedor(FornecedorDomain fornecedor) {
       FornecedorEntity fornecedorEntity = fornecedorMapper.toEntity(fornecedor);
       FornecedorEntity savedEntity = fornecedorRepository.save(fornecedorEntity);
       return fornecedorMapper.entityToDomain(savedEntity);
    }
    @Override
    public void deleteFornecedor(Long ID) {
        fornecedorRepository.deleteById(ID);
    }
    @Override
    public FornecedorDomain alterarFornecedor(Long ID, FornecedorDomain fornecedor) {
        FornecedorEntity fornecedorEntity = fornecedorMapper.toEntity(fornecedor);
        fornecedorRepository.updadeEstoque(fornecedorEntity, ID);
        return fornecedorMapper.entityToDomain(fornecedorEntity);
    }   
}