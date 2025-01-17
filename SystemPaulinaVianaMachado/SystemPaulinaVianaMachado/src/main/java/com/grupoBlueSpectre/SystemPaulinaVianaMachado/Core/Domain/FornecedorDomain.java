package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Enum.TipoProduto;

public record FornecedorDomain(Long idFornecedor,
                             double valorProdutoFornecedor,
                             String fornecedorEndereco,
                             String fornecedorNome,
                             String fornecedorTelefone,
                             String fornecedorEmail,
                             TipoProduto tipoProduto,
                             ProdutoDomain produto) {} 