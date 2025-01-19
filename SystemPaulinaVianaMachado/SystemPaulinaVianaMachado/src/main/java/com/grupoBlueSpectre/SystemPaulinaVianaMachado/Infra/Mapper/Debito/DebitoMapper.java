package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.Debito;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.DebitoDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Dto.DebitoDTO;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.MapperInteface;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.Entities.DebitoEntity;

public class DebitoMapper implements MapperInteface<DebitoDomain, DebitoDTO, DebitoEntity> {

    @Override
    public DebitoDomain toDomain(DebitoDTO debitoDTO) {
        if (debitoDTO == null) {
            return null;
        }
        return new DebitoDomain(debitoDTO.idDebito(),
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
                                debitoDomain.valorDebito(),
                                debitoDomain.cobrador(),
                                debitoDomain.descricaoConta(),
                                debitoDomain.tipoConta(),
                                debitoDomain.pagamento());
    }
    @Override
    public DebitoDomain entityToDomain(DebitoEntity debitoEntity) {
        if (debitoEntity == null) {
            return null;
        }
        return new DebitoDomain(debitoEntity.getId(),
                                debitoEntity.getValorDebito(),
                                debitoEntity.getCpfCobrador(),
                                debitoEntity.getDescricaoConta(),
                                debitoEntity.getTipoConta(),
                                debitoEntity.getPagamento());
    }
}