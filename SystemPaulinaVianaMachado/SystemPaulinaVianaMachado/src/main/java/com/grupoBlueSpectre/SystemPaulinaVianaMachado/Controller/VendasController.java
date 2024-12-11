package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Model.VendaModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Service.VendaService;
import java.util.List;

@RestController
@RequestMapping("/venda")
public class VendasController {
    @Autowired
    private VendaService vendaService;
    
    @GetMapping("/getall")
    public List<VendaModel> getAll(){
       return vendaService.GetAll();
    }
}
