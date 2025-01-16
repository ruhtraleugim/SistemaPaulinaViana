package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "RELATORIO")
@Table(name = "RELATORIO")
public class RelatorioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRelatorio;

    private String nomeRelatorio;
    private String descricaoRelatorio;
    private String tipoRelatorio;
    private Date dataRelatorio;

    @JoinColumn(name = "idEstoque")
    @OneToOne
    private EstoqueEntity estoque;
    @JoinColumn(name = "idVenda")
    @ManyToOne
    private VendaEntity venda;
}