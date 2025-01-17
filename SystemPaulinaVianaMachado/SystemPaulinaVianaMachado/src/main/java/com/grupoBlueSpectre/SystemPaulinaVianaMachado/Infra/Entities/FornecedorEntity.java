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
@Entity(name = "FORNECEDOR")
@Table(name = "FORNECEDOR")
public class FornecedorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFornecedor;

    private double valorProdutoFornecedor;
    private String fornecedorEndereco;
    private String fornecedorNome;
    private String fornecedorTelefone;
    private String fornecedorEmail;
    @Enumerated(EnumType.STRING)
    private TipoProduto tipoProduto;
    @ManyToMany()
    @JoinColumn(name = "idProduto")
    private ProdutoEntity produto;;
}