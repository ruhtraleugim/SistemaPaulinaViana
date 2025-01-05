package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.DTO;

public record FornecedorDTO(Long id,
                            String nome,
                            String cnpj,
                            String endereco,
                            String telefone,
                            String email) {}