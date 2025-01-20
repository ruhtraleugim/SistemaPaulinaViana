package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain;

import java.time.LocalDate;

public record EstoqueDomain(Long idEstoque,         
                            int versaoEstoque,
                            int quantidadeProduto,
                            LocalDate dataEstoque,
                            FornecedorDomain fornecedor,
                            ProdutoDomain produto) {} 
