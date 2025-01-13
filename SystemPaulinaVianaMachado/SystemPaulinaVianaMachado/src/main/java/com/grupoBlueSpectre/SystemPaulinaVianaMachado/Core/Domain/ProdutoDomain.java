package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain;

import java.util.Date;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Enum.TipoProduto;

public record ProdutoDomain(int idProduto,
                           String descricaoProduto,
                           String nomeProduto,
                           Date validadeProduto,
                           TipoProduto tipoProduto) {}