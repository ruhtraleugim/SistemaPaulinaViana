package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PagamentoDTO {
    private Integer idPagamento;
    private String tipoPagamento;
    private Double valor;
    private String dataPagamento;
    private Integer vendaId;
}