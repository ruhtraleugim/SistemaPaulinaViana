package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces;

import java.util.Optional;

public interface BuscarPorIDUserCase<E>{
    Optional<E> execute(int ID);
}