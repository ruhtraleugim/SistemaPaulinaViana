package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain;

import java.util.Date;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Enum.StatusPagamento;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Enum.TipoPagamento;

public record PagamentoModel(int idPagamento,
                            double valorPago,
                            String caminhoComprovante,
                            String recebedorPagamento,
                            Date dataPagamento,
                            TipoPagamento formaPagamento,
                            StatusPagamento statusPagamento) {}  