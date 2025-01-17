package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain;

import java.util.Date;

public record EstoqueDomain(Long idEstoque,         
                            int versaoEstoque,
                            int quantidadeProduto,
                            Date dataEstoque,
                            FornecedorDomain fornecedor,
                            ProdutoDomain produto) {} 
