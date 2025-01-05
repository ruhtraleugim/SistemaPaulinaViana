package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.Debito;

import org.springframework.stereotype.Component;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.DebitoModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Entities.DebitoEntity;

@Component
public class DebitoEntityMapper {
    
    public DebitoEntity toEntity( DebitoModel debito){
        return new DebitoEntity(
            debito.idDebito(),
            debito.valorDebito(),
            debito.cobrador(),
            debito.descricaoConta(),
            debito.tipoConta(),
            null
        );
    }
    public DebitoModel toDomain(DebitoEntity debitoEntity){
        return new DebitoModel(
            debitoEntity.getValorDebito(),
            debitoEntity.getValorDebito(),
            debitoEntity.getCpfCobrador(),
            debitoEntity.getDescricaoConta(),
            debitoEntity.getTipoConta(),
            debitoEntity.getPagamento()
        );
    }

    
}
