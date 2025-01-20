package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Dto;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Enum.StatusPagamento;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Enum.TipoPagamento;

import java.time.LocalDate;

public record PagamentoDTO( Long id,
                            double valorPago,
                            String cpfCobrador,
                            String recebedorPagamento,
                            LocalDate dataPagamento,
                            TipoPagamento formaPagamento,
                            StatusPagamento statusPagamento) {}