package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoDTO {
    private Integer idProduto;
    private String nome;
    private String descricao;
    private Double precoVenda;
    private Double precoCompra;
    private Long fornecedorId;
}