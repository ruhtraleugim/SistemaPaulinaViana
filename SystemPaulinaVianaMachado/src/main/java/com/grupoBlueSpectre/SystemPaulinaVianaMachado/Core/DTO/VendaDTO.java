package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendaDTO {
    private Integer idVenda;
    private Double valorTotal;
    private String dataVenda;
    private String status;
}