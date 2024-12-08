package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Model;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Enum.StatusPagamento;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Enum.TipoPagamento;

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
@Entity(name = "Pagamento")
@Getter
@NoArgsConstructor
@Setter
@Table(name = "Pagamentos")
public class PagamentoModel {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPagamento;

    private double valorPago;
    private String caminhoComprovante;
    private String recebedorPagamento;
    private StatusPagamento statusPagamento;
    private TipoPagamento formaPagamento;

}
