package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.DTO;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record VendaDTO(
    Long id,
    LocalDateTime dataVenda,
    BigDecimal valorTotal,
    Long produtoId,
    Integer quantidade
) {}