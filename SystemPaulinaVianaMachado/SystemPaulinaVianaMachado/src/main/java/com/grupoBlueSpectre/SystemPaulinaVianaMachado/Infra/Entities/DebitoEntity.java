package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Entities;


import jakarta.persistence.*;

@Entity(name = "DEBITO")
@Table(name = "DEBITO")
public class DebitoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double valorDebito;
    private String cpfCobrador;
    private String descricaoConta;
    private String tipoConta;
    private PagamentoEntity pagamento;
}