package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.DTO;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record DebitoDTO(Long id,
                        BigDecimal valor,
                        LocalDateTime dataDebito,
                        String descricao) {}