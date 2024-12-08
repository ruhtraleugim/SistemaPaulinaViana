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
@Entity(name = "Relatorio")
@Getter
@NoArgsConstructor
@Setter
@Table(name = "Relatorios")
public class RelatorioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRelatorio;

    private double lucroEsperado;
    private double lucroPorProduto;
    private LocalDateTime dataHoraRelatorio;

    @ManyToOne
    @JoinColumn(name = "EstoqueID" , nullable = false)
    private EstoqueModel estoque;

    @ManyToOne
    @JoinColumn(name = "vendaID" , nullable = false)
    private VendaModel venda;
    
}
