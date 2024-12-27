package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Enum.StatusPagamento;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Enum.TipoPagamento;

public record PagamentoModel(int idPagamento,
                            double valorPago,
                            String caminhoComprovante,
                            String recebedorPagamento,
                            TipoPagamento formaPagamento,
                            StatusPagamento statusPagamento) {}  
