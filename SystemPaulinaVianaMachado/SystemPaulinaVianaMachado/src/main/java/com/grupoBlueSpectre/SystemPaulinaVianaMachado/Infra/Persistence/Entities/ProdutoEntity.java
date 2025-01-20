package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.Entities;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Enum.TipoProduto;

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
@Entity(name = "PRODUTO")
@Table(name = "PRODUTO")
public class ProdutoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idProduto;

    private String descricaoProduto;
    private String nomeProduto;
    private Date validadeProduto;

    @Enumerated(EnumType.STRING)
    private TipoProduto tipoProduto;
    
    private double valorProduto;
    
    @ManyToOne
    @JoinColumn(name = "idFornecedor")
    private FornecedorEntity fornecedorEntity;
}