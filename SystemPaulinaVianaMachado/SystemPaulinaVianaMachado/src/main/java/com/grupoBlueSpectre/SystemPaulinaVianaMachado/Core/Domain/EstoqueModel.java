package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain;

import java.util.Date;

public record EstoqueModel(int idEstoque,
                        int versaoEstoque,
                        int quantidadeProduto,
                        Date dataEstoque,
                        FornecedorModel fornecedor,
                        ProdutoModel produto) {} 