package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.DTO;


import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.PagamentoModel;


public record DebitoDTO(Long idDebito,
                        double valorDebito,
                        String cobrador,
                        String descricaoConta,
                        String tipoConta,
                        PagamentoModel pagamento) {}