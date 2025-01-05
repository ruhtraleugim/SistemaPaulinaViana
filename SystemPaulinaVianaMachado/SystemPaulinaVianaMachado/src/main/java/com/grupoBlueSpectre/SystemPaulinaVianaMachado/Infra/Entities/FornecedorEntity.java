package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Entities;

import jakarta.persistence.*;
import javax.persistence.GenerationType;

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
    private String tipoProduto;
    
}
