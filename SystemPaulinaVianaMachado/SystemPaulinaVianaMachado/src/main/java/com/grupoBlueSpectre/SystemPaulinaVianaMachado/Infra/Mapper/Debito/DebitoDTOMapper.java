package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.Debito;

import org.springframework.stereotype.Component;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.DebitoModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.DTO.DebitoDTO;

@Component
public class DebitoDTOMapper {
    
    public DebitoDTO toDTO(DebitoModel debito){
        return new DebitoDTO(
            debito.idDebito(),
            debito.valorDebito(),
            debito.cobrador(),
            debito.descricaoConta(),
            debito.tipoConta(),
            debito.pagamento()
        );        
    }

    public DebitoModel toDomain(DebitoDTO debitoDTO){
        return new DebitoModel(
            debitoDTO.idDebito(),
            debitoDTO.valorDebito(),
            debitoDTO.cobrador(),
            debitoDTO.descricaoConta(),
            debitoDTO.tipoConta(),
            debitoDTO.pagamento()
        );
    }
}