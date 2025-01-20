package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Dto;

import java.time.LocalDate;

public record EstoqueDTO(Long idEstoque,          
                         int versaoEstoque,
                         int quantidadeProduto,
                         LocalDate dataEstoque,
                         FornecedorDTO fornecedor,
                         ProdutoDTO produto) {}  
