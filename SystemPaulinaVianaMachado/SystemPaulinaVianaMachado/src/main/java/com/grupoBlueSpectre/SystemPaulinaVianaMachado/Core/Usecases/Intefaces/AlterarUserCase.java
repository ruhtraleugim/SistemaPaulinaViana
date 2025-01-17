package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces;

public interface AlterarUserCase<E> {
    E execute(Long ID, E e);
}