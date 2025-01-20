package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Dto;


import java.time.LocalDate;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.PagamentoDomain;


public record DebitoDTO(Long idDebito,
                        LocalDate dataDebito,
                        double valorDebito,
                        String cobrador,
                        String descricaoConta,
                        String tipoConta,
                        PagamentoDomain pagamento) {}