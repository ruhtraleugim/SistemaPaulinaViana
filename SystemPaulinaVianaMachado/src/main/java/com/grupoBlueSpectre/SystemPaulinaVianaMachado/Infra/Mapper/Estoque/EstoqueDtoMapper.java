package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.Estoque;

import org.springframework.stereotype.Component;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.EstoqueDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Dto.EstoqueDTO;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.MapperInteface;

@Component
public class EstoqueDtoMapper implements MapperInteface<EstoqueDTO, EstoqueDomain> {

    @Override
    public EstoqueDTO executeD(EstoqueDomain estoqueDomain) {
        return new EstoqueDTO(null, null, null, null);
    }

    @Override
    public EstoqueDomain executeT(EstoqueDTO estoqueDTO) {
        return new EstoqueDomain(estoqueDTO);
    }
    
}
