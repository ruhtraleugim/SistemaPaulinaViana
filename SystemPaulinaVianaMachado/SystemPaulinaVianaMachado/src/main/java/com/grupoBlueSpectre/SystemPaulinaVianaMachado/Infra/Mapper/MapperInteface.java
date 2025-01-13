package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper;


public interface MapperInteface <D , T > {

    D executeD(T t);

    T executeT(D d);
}