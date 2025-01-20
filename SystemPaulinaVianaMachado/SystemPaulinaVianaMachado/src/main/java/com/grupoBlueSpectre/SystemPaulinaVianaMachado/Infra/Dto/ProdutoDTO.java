package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Dto;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.FornecedorDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Enum.TipoProduto;

import java.time.LocalDate;

public record ProdutoDTO(Long idProduto,
                           String descricaoProduto,
                           String nomeProduto,
                           LocalDate validadeProduto,
                           TipoProduto tipoProduto,
                           double valorProduto,
                           FornecedorDomain fornecedorDomain) {}