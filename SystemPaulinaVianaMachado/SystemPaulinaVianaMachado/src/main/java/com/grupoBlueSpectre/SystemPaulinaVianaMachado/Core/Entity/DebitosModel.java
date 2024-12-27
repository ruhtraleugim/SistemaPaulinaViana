package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity;

public record DebitosModel(int idDebitos,
                           double valorCobrado,
                           String cobrador,
                           String descricaoConta,
                           String tipoConta,
                           PagamentoModel pagamento){}