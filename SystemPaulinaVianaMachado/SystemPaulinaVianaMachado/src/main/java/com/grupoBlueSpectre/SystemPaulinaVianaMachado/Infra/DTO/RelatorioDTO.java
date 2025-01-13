package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record RelatorioDTO( Long id,
                            LocalDateTime dataRelatorio,
                            BigDecimal totalVendas,
                            BigDecimal totalDespesas,
                            BigDecimal lucroLiquido) {}