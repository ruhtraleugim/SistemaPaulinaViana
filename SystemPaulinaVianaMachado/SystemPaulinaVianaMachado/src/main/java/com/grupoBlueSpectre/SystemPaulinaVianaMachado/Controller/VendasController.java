package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    
    @GetMapping("/getAll")
    public List<VendaModel> getAll(){
        return vendaService.getAllVendas();
    }
    @PostMapping("/postVenda")
    public VendaModel addVenda(@RequestBody VendaModel venda){
        return vendaService.newVenda(venda);
    }
    @DeleteMapping("/deleteVenda/{id}")
    public void deleteVenda(@PathVariable Integer id){
        vendaService.deleteVenda(id);
    }
    @PutMapping("/update/{id}")
    public VendaModel updateVenda(@RequestBody VendaModel venda,@PathVariable Integer id){
        
        return vendaService.updateVenda(venda,id);
    }

}
