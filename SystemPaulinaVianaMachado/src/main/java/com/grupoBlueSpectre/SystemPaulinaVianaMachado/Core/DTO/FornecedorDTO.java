package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FornecedorDTO {
    private Long id;
    private String nome;
    private String cnpj;
    private String endereco;
    private String telefone;
    private String email;
}