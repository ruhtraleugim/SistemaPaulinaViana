package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Entity;

import java.time.LocalDateTime;

public record RelatorioModel(int idRelatorio,
                            double lucroEsperado,
                            double lucroPorProduto,
                            LocalDateTime dataHoraRelatorio,
                            EstoqueModel estoque, 
                            VendaModel venda) {}