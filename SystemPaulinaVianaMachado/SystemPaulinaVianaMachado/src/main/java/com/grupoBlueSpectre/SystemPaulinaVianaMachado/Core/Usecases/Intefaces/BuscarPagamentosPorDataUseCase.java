package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces;

import java.util.Date;
import java.util.List;

public interface BuscarPagamentosPorDataUseCase<E> {
    List<E> execute (Date date);
}
