package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Entities;

import java.util.Date;

import jakarta.persistence.*;

@Entity(name = "ESTOQUE")
@Table(name = "ESTOQUE")
public class EstoqueEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int versaoEstoque;
    private int quantidadeProduto;
    private Date dataEstoque;
    @ManyToOne
    @JoinColumn(name = "fornecedor_id")
    private FornecedorEntity fornecedor;
    @ManyToOne
    @JoinColumn(name = "produto_id")
    private ProdutoEntity produto;

}