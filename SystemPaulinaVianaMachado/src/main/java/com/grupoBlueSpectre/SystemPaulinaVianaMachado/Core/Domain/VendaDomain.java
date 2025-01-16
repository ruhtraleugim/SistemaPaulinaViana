package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain;

import java.time.LocalDateTime;

public record VendaDomain(int idVenda,
                        int quantidadeProduto,
                        double valorVenda,
                        LocalDateTime dataVenda,
                        ProdutoDomain produtoVenda,
                        PagamentoDomain pagamento){}