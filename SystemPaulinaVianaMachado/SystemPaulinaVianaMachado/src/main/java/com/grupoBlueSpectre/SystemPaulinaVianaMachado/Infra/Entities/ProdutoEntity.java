package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Entities;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Enum.TipoProduto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "PRODUTO")
@Table(name = "PRODUTO")
public class ProdutoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduto;

    private String nomeProduto;
    private double valorProduto;
    private String descricaoProduto;
    private int quantidadeProduto;

    @Enumerated(EnumType.STRING)
    private TipoProduto tipoProduto;
}