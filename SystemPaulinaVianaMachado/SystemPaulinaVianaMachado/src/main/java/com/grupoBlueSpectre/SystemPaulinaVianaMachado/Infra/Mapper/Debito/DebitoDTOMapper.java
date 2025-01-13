package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.Debito;

import org.springframework.stereotype.Component;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.DebitoDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Dto.DebitoDTO;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.MapperInteface;

@Component
public class DebitoDTOMapper implements MapperInteface<DebitoDTO ,DebitoDomain> {

    @Override
    public DebitoDTO executeD(DebitoDomain debitoDomain) {
        return new DebitoDTO (debitoDomain.idDebito(),
                         debitoDomain.valorDebito(),
                         debitoDomain.cobrador(),
                         debitoDomain.descricaoConta(),
                         debitoDomain.tipoConta(),
                         debitoDomain.pagamento());
   }

    @Override
    public DebitoDomain executeT(DebitoDTO debitoDTO) {
       return new DebitoDomain (debitoDTO.idDebito(),
                           debitoDTO.valorDebito(),
                           debitoDTO.cobrador(),
                           debitoDTO.descricaoConta(),
                           debitoDTO.tipoConta(),
                           debitoDTO.pagamento());
    }
}