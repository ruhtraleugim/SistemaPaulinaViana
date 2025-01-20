package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Gateway;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Domain.RelatorioDomain;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Core.Gateway.RelatorioGateway;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Mapper.Relatorio.RelatorioMapper;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Infra.Persistence.RelatorioPersistence;

public class RelatorioInfraGateway implements RelatorioGateway{

    private final RelatorioPersistence relatorioRepository;
    private final RelatorioMapper relatorioMapper;

    public RelatorioInfraGateway(RelatorioPersistence relatorioRepository ,RelatorioMapper relatorioMapper) {
        this.relatorioRepository = relatorioRepository;
        this.relatorioMapper = relatorioMapper;
    }
    @Override
    public Optional<RelatorioDomain> getRelatorioByID(Long ID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRelatorioByID'");
    }

    @Override
    public List<RelatorioDomain> getRelatorio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRelatorio'");
    }

    @Override
    public List<RelatorioDomain> getRelatorioByDate(Date date) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRelatorioByDate'");
    }

    @Override
    public void deleteRelatorio(Long ID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteRelatorio'");
    }

    @Override
    public RelatorioDomain newRelatorio(RelatorioDomain relatorio) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'newRelatorio'");
    }

    @Override
    public RelatorioDomain alterarRelatorio(Long ID, RelatorioDomain relatorio) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alterarRelatorio'");
    }
    
}
