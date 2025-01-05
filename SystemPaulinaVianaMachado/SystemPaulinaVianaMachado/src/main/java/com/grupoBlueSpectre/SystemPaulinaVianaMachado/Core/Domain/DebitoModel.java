package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain;

public record DebitoModel(int idDebitos,
                           double valorCobrado,
                           String cobrador,
                           String descricaoConta,
                           String tipoConta,
                           PagamentoModel pagamento){}