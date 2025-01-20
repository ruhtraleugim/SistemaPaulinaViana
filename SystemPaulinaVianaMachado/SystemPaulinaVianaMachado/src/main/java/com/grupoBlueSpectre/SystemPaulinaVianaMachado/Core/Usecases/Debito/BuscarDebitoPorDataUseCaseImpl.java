package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Debito;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.DebitoDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.DebitoGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Usecases.Intefaces.BuscarPorDataUseCase;

public class BuscarDebitoPorDataUseCaseImpl implements BuscarPorDataUseCase<DebitoDomain>{

    private final DebitoGateway debitoGateway;

    public BuscarDebitoPorDataUseCaseImpl(DebitoGateway debitoGateway){
        this.debitoGateway = debitoGateway;
    }
    @Override
    public List<DebitoDomain> execute(LocalDate date) {
        return debitoGateway.getDebitosByDate(date);
    }
}
