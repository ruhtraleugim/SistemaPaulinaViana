package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.Entities;

import java.util.Date;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "ESTOQUE")
@Table(name = "ESTOQUE")
public class EstoqueEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstoque; 

    private int versaoEstoque;
    private int quantidadeProduto;
    private Date dataEstoque;

    @ManyToOne
    @JoinColumn(name = "idFornecedor")
    private FornecedorEntity fornecedor;

    @ManyToOne
    @JoinColumn(name = "idProduto")
    private ProdutoEntity produto;
}
