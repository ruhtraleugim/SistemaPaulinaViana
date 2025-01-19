package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.Relatorio;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.RelatorioDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Dto.RelatorioDTO;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.MapperInteface;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.Estoque.EstoqueMapper;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.Venda.VendaMapper;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.Entities.RelatorioEntity;

public class RelatorioMapper implements MapperInteface<RelatorioDomain, RelatorioDTO, RelatorioEntity> {

    private final EstoqueMapper estoqueMapper;
    private final VendaMapper vendaMapper;

    private RelatorioMapper( EstoqueMapper estoqueMapper,VendaMapper vendaMapper) {
        this.estoqueMapper = estoqueMapper;
        this.vendaMapper = vendaMapper;
    }
    @Override
    public RelatorioDomain toDomain(RelatorioDTO dto) {
        if (dto == null) {
            return null;
        }
        return new RelatorioDomain(dto.idRelatorio(),
                                    dto.lucroEsperado(),
                                    dto.lucroPorProduto(),
                                    dto.dataHoraRelatorio(),
                                    estoqueMapper.toDomain(dto.estoque()),
                                    vendaMapper.toDomain(dto.venda()));
    }
    @Override
    public RelatorioDTO toDto(RelatorioDomain domain) {
        if (domain == null) {
            return null;
        }
        return new RelatorioDTO(domain.idRelatorio(),
                                domain.lucroEsperado(),
                                domain.lucroPorProduto(),
                                domain.dataHoraRelatorio(),
                                estoqueMapper.toDto(domain.estoque()),
                                vendaMapper.toDto(domain.venda()));
    }
    @Override
    public RelatorioEntity toEntity(RelatorioDomain domain) {
       if (domain == null) {
            return null;
       }
        return new RelatorioEntity(domain.idRelatorio(),
                                    domain.lucroEsperado(),
                                    domain.lucroPorProduto(),
                                    domain.dataHoraRelatorio(),
                                    estoqueMapper.toEntity(domain.estoque()),
                                    vendaMapper.toEntity(domain.venda()));
    }
    @Override
    public RelatorioDomain entityToDomain(RelatorioEntity entity) {
        if (entity == null ) {
            return null;
        }
        
        return new RelatorioDomain(entity.getIdRelatorio(),
                                    entity.getLucroEsperado(),
                                    entity.getLucroPorProduto(),
                                    entity.getDataHoraRelatorio(),
                                    estoqueMapper.entityToDomain(entity.getEstoque()),
                                    vendaMapper.entityToDomain(entity.getVenda()));   
    }   
}