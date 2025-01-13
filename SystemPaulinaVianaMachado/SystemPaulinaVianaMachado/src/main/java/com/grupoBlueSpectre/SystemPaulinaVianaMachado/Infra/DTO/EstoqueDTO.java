package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Dto;

import java.time.LocalDateTime;

public record EstoqueDTO(Long id,
                         Integer quantidade,
                         LocalDateTime dataEntrada,
                         Long produtoId) {}