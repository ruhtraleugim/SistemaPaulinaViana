package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RelatorioDTO {
    private Integer idRelatorio;
    private String tipo;
    private String dataGeracao;
    private String conteudo;
}