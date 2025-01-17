package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Entities;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Enum.StatusPagamento;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Enum.TipoPagamento;

import java.util.Date;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "PAGAMENTO")
@Table(name = "PAGAMENTO")
public class PagamentoEntity {
        private Long idPagamento;
        private double valorPagamento;
        private String cpfCobrador;
        private String recebedorPagamento;
        private Date dataPagamento;

        @Enumerated(EnumType.STRING)
        private TipoPagamento tipoPagamento; 
        @Enumerated(EnumType.STRING)     
        private StatusPagamento statusPagamento;
}