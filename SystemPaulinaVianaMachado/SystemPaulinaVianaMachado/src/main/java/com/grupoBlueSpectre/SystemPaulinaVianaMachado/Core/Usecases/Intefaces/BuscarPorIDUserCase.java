package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces;

import java.util.Optional;

public interface BuscarPorIDUserCase<E>{
    public Optional<E> execute(int ID);
}
