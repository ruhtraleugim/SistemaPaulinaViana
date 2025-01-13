package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Dto;


import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.PagamentoDomain;


public record DebitoDTO(Long idDebito,
                        double valorDebito,
                        String cobrador,
                        String descricaoConta,
                        String tipoConta,
                        PagamentoDomain pagamento) {}