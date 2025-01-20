package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain;

import java.time.LocalDate;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Enum.StatusPagamento;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Enum.TipoPagamento;

public record PagamentoDomain(Long idPagamento,
                            double valorPago,
                            String cpfCobrador,
                            String recebedorPagamento,
                            LocalDate dataPagamento,
                            TipoPagamento formaPagamento,
                            StatusPagamento statusPagamento) {}  