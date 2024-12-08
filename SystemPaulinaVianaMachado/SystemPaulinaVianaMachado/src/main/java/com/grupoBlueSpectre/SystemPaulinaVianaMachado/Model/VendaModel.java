package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Model;

import java.time.LocalDateTime;

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
@Entity(name = "Venda")
@Getter
@NoArgsConstructor
@Setter
@Table(name = "Vendas")

public class VendaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVenda;

    private int quantidadeProduto;
    private double valorVenda;
    private LocalDateTime dataVenda;

    @ManyToOne
    @JoinColumn(name = "produtoID" , nullable = false)
    private ProdutoModel produtoVenda;

    @ManyToOne
    @JoinColumn(name = "pagamentoID" , nullable = false)
    private PagamentoModel pagamento;
}
