package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.Debito;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.DebitoDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Dto.DebitoDTO;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.MapperInteface;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.Pagamento.PagamentoMapper;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.Entities.DebitoEntity;

@Component
public class DebitoMapper implements MapperInteface<DebitoDomain, DebitoDTO, DebitoEntity> {

    private final PagamentoMapper pagamentoMapper;

    public DebitoMapper(@Lazy PagamentoMapper pagamentoMapper) {
        this.pagamentoMapper = pagamentoMapper;
    }
    @Override
    public DebitoDomain toDomain(DebitoDTO debitoDTO) {
        if (debitoDTO == null) {
            return null;
        }
        return new DebitoDomain(debitoDTO.idDebito(),
                                debitoDTO.dataDebito(),
                                debitoDTO.valorDebito(),
                                debitoDTO.cobrador(),
                                debitoDTO.descricaoConta(),
                                debitoDTO.tipoConta(),
                                debitoDTO.pagamento());
    }
    @Override
    public DebitoDTO toDto(DebitoDomain debitoDomain) {
        if (debitoDomain == null) {
            return null;
        }
        return new DebitoDTO(debitoDomain.idDebito(),
                            debitoDomain.dataDebito(),
                            debitoDomain.valorDebito(),
                            debitoDomain.cobrador(),
                            debitoDomain.descricaoConta(),
                            debitoDomain.tipoConta(),
                            debitoDomain.pagamento());
    }
    @Override
    public DebitoEntity toEntity(DebitoDomain debitoDomain) {
        if (debitoDomain == null) {
            return null;
        }
        return new DebitoEntity(debitoDomain.idDebito(),
                                debitoDomain.dataDebito(),
                                debitoDomain.valorDebito(),
                                debitoDomain.cobrador(),
                                debitoDomain.descricaoConta(),
                                debitoDomain.tipoConta(),
                                pagamentoMapper.toEntity(debitoDomain.pagamento()));
    }
    @Override
    public DebitoDomain entityToDomain(DebitoEntity debitoEntity) {
        if (debitoEntity == null) {
            return null;
        }
        return new DebitoDomain(debitoEntity.getId(),
                                debitoEntity.getDataDebito(),
                                debitoEntity.getValorDebito(),
                                debitoEntity.getCpfCobrador(),
                                debitoEntity.getDescricaoConta(),
                                debitoEntity.getTipoConta(),
                                pagamentoMapper.entityToDomain(debitoEntity.getPagamento()));
    }
}