package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain;

import java.time.LocalDate;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Enum.TipoProduto;

public record ProdutoDomain(Long idProduto,
                           String descricaoProduto,
                           String nomeProduto,
                           LocalDate validadeProduto,
                           TipoProduto tipoProduto,
                           double valorProduto,
                           FornecedorDomain fornecedorDomain) {}