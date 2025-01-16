package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Dto;

import java.sql.Date;

public record EstoqueDTO(Long id,
                         int versao,
                         int quantidadeProduto,
                         int quantidade,
                         Date dataEntrada,
                         FornecedorDomain f
                         Long produtoId) {}