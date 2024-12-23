package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Entity(name = "Estoque")
@Getter
@NoArgsConstructor
@Setter
@Table(name = "Estoque")
public class EstoqueModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstoque;

    private int quantidadeProduto;
    private Date dataEntrega;

    @ManyToOne
    @JoinColumn(name = "fonecedorID" , nullable = false)
    private FornecedorModel fornecedor;

    @ManyToOne
    @JoinColumn(name = "produtoID" , nullable = false)
    private ProdutoModel produto;
}
