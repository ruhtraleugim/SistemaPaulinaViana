package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "Estoque")
@Table(name = "Estoque")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EstoqueModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstoque;

    private int quantidadeProduto;
    private String dataEntrega;
    private FornecedorModel fornecedor;
    private ProdutoModel produto;
}
