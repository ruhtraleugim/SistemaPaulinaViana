package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Dto;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Enum.TipoProduto;

public record FornecedorDTO(Long id,
                            double valorProdutoFornecedor,
                            String fornecedorEndereco,
                            String fornecedorNome,
                            String fornecedorTelefone,
                            String fornecedorEmail,
                            TipoProduto tipoProduto,
                            ProdutoDTO produtoDTO) {}