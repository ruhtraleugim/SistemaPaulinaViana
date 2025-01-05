package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Entities;

import java.util.Date;

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
    @JoinColumn(name = "idFornecedor")
    private FornecedorEntity fornecedor;
    @ManyToOne
    @JoinColumn(name = "idProduto")
    private ProdutoEntity produto;
}