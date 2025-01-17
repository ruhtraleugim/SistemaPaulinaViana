package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Dto;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Enum.StatusPagamento;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Enum.TipoPagamento;
import java.util.Date;

public record PagamentoDTO( Long id,
                            double valorPago,
                            String cpfCobrador,
                            String recebedorPagamento,
                            Date dataPagamento,
                            TipoPagamento formaPagamento,
                            StatusPagamento statusPagamento) {}