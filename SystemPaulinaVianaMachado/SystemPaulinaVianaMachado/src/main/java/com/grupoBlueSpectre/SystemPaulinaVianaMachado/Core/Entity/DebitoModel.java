package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity;

public record DebitoModel(int idDebitos,
                           double valorCobrado,
                           String cobrador,
                           String descricaoConta,
                           String tipoConta,
                           PagamentoModel pagamento){}