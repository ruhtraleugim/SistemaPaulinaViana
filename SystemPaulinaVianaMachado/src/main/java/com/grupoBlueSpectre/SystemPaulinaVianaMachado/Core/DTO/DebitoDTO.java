package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DebitoDTO {
    private Long id;
    private String descricao;
    private Double valor;
    private String dataPagamento;
}