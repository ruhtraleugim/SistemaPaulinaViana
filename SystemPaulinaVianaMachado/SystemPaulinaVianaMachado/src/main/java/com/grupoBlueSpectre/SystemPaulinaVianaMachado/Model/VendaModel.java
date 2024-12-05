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

@Entity(name = "Venda")
@Table(name = "Venda")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VendaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVenda;

    private int quantidadeProduto;
    private double valorVenda;
    private String dataVenda;
    private ProdutoModel produtoVenda;
    private PagamentoModel pagamento;
}
