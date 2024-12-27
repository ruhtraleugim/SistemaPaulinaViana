package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity;

import java.util.Date;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Enum.TipoProduto;

public record ProdutoModel(int idProduto,
                           String descricaoProduto,
                           String nomeProduto,
                           Date validadeProduto,
                           TipoProduto tipoProduto) {}
