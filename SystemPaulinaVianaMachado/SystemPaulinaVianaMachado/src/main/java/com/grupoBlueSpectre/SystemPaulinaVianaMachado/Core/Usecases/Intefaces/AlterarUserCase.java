package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces;

public interface AlterarUserCase<E> {
    E execute(int ID, E e);
}