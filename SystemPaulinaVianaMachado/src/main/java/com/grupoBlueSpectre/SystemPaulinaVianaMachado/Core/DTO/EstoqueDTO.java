package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstoqueDTO {
    private Long id;
    private Long produtoId;
    private Integer quantidade;
    private String dataAtualizacao;
}