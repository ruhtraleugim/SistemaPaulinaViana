package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity;

import java.time.LocalDateTime;

public record VendaModel(int idVenda,
                        int quantidadeProduto,
                        double valorVenda,
                        LocalDateTime dataVenda,
                        ProdutoModel produtoVenda,
                        PagamentoModel pagamento){}