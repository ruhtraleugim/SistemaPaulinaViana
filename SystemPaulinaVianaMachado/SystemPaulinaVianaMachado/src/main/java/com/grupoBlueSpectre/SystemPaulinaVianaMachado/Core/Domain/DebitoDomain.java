package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain;

import java.time.LocalDate;

public record DebitoDomain(Long idDebito,
                           LocalDate dataDebito,
                           double valorDebito,
                           String cobrador,
                           String descricaoConta,
                           String tipoConta,
                           PagamentoDomain pagamento){}