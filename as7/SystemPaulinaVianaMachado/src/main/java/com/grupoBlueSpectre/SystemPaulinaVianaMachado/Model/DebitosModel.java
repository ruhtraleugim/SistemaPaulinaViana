package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Model;

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
@Entity(name = "Debito")
@Getter
@NoArgsConstructor
@Setter
@Table(name = "Debitos")

public class DebitosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDebitos;

    private double valorCobrado;
    private String cobrador;
    private String descricaoConta;
    private String tipoConta;

    @ManyToOne
    @JoinColumn(name = "pagamentoID" , nullable = false)
    private PagamentoModel pagamento;
}

