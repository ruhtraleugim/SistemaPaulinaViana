package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces;

import java.util.List;

public interface BuscarUseCase<E> {
    List<E> execute();
}