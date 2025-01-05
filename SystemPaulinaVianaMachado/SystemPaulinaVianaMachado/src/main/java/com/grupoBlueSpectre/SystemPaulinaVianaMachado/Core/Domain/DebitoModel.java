package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain;

public record DebitoModel(Long idDebito,
                           double valorDebito,
                           String cobrador,
                           String descricaoConta,
                           String tipoConta,
                           PagamentoModel pagamento){}