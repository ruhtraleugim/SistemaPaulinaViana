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

@AllArgsConstructor
@Entity(name = "Fornecedor")
@Getter
@NoArgsConstructor
@Setter
@Table(name = "Fornecedores")
public class FornecedorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFornecedor;

    private double valorProdutoFornecedor;
    private String fornecedorEndereco;
    private String fornecedorNome;
    private String fornecedorTelefone;
    private String tipoProduto;


}