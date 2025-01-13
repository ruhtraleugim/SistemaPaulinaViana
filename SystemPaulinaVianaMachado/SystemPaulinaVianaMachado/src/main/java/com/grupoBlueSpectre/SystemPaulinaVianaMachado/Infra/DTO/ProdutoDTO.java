package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Dto;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Enum.TipoProduto;
import java.math.BigDecimal;

public record ProdutoDTO(Long id,
                        String nome,
                        String descricao,
                        BigDecimal preco,
                        TipoProduto tipo,
                        Long fornecedorId) {}