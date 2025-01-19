package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.Venda;

import org.springframework.stereotype.Component;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.VendaDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Dto.VendaDTO;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.MapperInteface;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.Pagamento.PagamentoMapper;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.Produto.ProdutoMapper;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.Entities.VendaEntity;

@Component
public class VendaMapper implements MapperInteface<VendaDomain, VendaDTO, VendaEntity>{
    
    private final ProdutoMapper produtoMapper;
    private final PagamentoMapper pagamentoMapper;

    public VendaMapper(ProdutoMapper produtoMapper, PagamentoMapper pagamentoMapper) {
        this.produtoMapper = produtoMapper;
        this.pagamentoMapper = pagamentoMapper;
    }
    @Override
    public VendaDomain toDomain(VendaDTO dto) {
        if (dto == null) {
            return null;
        }
        return new VendaDomain(dto.idVenda(),
                                dto.quantidadeProduto(),
                                dto.valorVenda(),
                                dto.dataVenda(),
                                produtoMapper.toDomain(dto.produtoVenda()),
                                pagamentoMapper.toDomain(dto.pagamento()));
    }
    @Override
    public VendaDTO toDto(VendaDomain domain) {
        if (domain == null) {
            return null;
        }
        return new VendaDTO(domain.idVenda(),
                            domain.quantidadeProduto(),
                            domain.valorVenda(),
                            domain.dataVenda(),
                            produtoMapper.toDto(domain.produtoVenda()),
                            pagamentoMapper.toDto(domain.pagamento()));
    }
    @Override
    public VendaEntity toEntity(VendaDomain domain) {
        if (domain == null) {
            return null;
        }
        return new VendaEntity(domain.idVenda(),
                                domain.quantidadeProduto(),
                                domain.valorVenda(),
                                domain.dataVenda(),
                                produtoMapper.toEntity(domain.produtoVenda()),
                                pagamentoMapper.toEntity(domain.pagamento()));
    }
    @Override
    public VendaDomain entityToDomain(VendaEntity entity) {
        if (entity == null) {
            return null;
        }
        return new VendaDomain(entity.getIdVenda(),
                                entity.getQuantidadeProduto(),
                                entity.getValorVenda(),
                                entity.getDataVenda(),
                                produtoMapper.entityToDomain(entity.getProdutoVenda()),
                                pagamentoMapper.entityToDomain(entity.getPagamento()));
    }
}