package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Model;

import java.util.Date;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Enum.TipoProduto;

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
@Entity(name = "Protuto")
@Getter
@NoArgsConstructor
@Setter
@Table(name = "Produtos")
public class ProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProduto;

    private String descricaoProduto;
    private String nomeProduto;
    private Date validadeProduto;
    private TipoProduto tipoProduto;
}
