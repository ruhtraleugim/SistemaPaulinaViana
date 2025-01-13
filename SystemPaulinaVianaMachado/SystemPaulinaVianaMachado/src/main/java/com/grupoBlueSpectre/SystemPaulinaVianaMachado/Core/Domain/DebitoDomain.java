package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain;

public record DebitoDomain(Long idDebito,
                           double valorDebito,
                           String cobrador,
                           String descricaoConta,
                           String tipoConta,
                           PagamentoDomain pagamento){}