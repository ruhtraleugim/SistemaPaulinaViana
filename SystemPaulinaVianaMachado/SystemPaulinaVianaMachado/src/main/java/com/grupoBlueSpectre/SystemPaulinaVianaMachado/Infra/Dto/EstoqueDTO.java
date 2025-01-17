package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Dto;

import java.util.Date;

public record EstoqueDTO(Long idEstoque,          
                         int versaoEstoque,
                         int quantidadeProduto,
                         Date dataEstoque,
                         FornecedorDTO fornecedor,
                         ProdutoDTO produto) {}  
