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

//arrumar em Ordem Alfabetica em algum momento
@Entity(name = "Protuto")
@Table(name = "Produto")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProduto;

    private String nomeProduto;
    private String descricaoProduto;
    private String validadeProduto;
}
