package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.DTO;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record RelatorioDTO( Long id,
                            LocalDateTime dataRelatorio,
                            BigDecimal totalVendas,
                            BigDecimal totalDespesas,
                            BigDecimal lucroLiquido) {}