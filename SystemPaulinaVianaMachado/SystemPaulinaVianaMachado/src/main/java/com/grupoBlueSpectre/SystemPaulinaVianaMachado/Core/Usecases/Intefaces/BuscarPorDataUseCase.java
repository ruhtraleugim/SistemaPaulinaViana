package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces;

import java.time.LocalDate;
import java.util.List;

public interface BuscarPorDataUseCase<E> {
    List<E> execute (LocalDate date);
}