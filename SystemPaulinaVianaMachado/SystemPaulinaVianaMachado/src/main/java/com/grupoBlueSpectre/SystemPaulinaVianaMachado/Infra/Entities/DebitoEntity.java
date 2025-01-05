package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Entities;
    

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.PagamentoModel;

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

    @ManyToOne
    @JoinColumn(name = "idPagamento")
    private PagamentoModel pagamento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getValorDebito() {
        return valorDebito;
    }

    public void setValorDebito(double valorDebito) {
        this.valorDebito = valorDebito;
    }

    public String getCpfCobrador() {
        return cpfCobrador;
    }

    public void setCpfCobrador(String cpfCobrador) {
        this.cpfCobrador = cpfCobrador;
    }

    public String getDescricaoConta() {
        return descricaoConta;
    }

    public void setDescricaoConta(String descricaoConta) {
        this.descricaoConta = descricaoConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public PagamentoModel getPagamento() {
        return pagamento;
    }

    public void setPagamento(PagamentoModel pagamento) {
        this.pagamento = pagamento;
    }

    public DebitoEntity(Long id, double valorDebito, String cpfCobrador, String descricaoConta, String tipoConta,
            PagamentoModel pagamento) {
        this.id = id;
        this.valorDebito = valorDebito;
        this.cpfCobrador = cpfCobrador;
        this.descricaoConta = descricaoConta;
        this.tipoConta = tipoConta;
        this.pagamento = pagamento;
    }

    public DebitoEntity() {
    }
}