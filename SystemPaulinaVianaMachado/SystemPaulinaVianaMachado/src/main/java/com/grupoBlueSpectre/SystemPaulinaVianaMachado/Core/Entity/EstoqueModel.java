package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity;

import java.util.Date;

public record EstoqueModel(int idEstoque,
                        int versaoEstoque,
                        int quantidadeProduto,
                        Date dataEntrega,
                        FornecedorModel fornecedor,
                        ProdutoModel produto) {}

    
    
