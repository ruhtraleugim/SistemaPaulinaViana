package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces;

import java.util.Optional;

public interface BuscarPorNomeUseCase<E>{
    Optional<E> execute(String Nome);
}
