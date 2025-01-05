package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.DTO;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Enum.StatusPagamento;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Enum.TipoPagamento;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PagamentoDTO( Long id,
                            BigDecimal valor,
                            LocalDateTime dataPagamento,
                            TipoPagamento tipoPagamento,
                            StatusPagamento statusPagamento) {}