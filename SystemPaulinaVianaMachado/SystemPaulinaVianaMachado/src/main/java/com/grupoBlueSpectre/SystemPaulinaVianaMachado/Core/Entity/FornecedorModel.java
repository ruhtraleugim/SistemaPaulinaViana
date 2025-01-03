package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Enum.TipoProduto;

public record FornecedorModel(int idFornecedor,
                             double valorProdutoFornecedor,
                             String fornecedorEndereco,
                             String fornecedorNome,
                             String fornecedorTelefone,
                             TipoProduto tipoProduto) {} 