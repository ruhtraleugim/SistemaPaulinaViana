package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain;

import java.time.LocalDateTime;

public record RelatorioDomain(Long idRelatorio,
                            double lucroEsperado,
                            double lucroPorProduto,
                            LocalDateTime dataHoraRelatorio,
                            EstoqueDomain estoque, 
                            VendaDomain venda) {}