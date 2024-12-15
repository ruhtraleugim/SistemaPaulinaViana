package com.grupoBlueSpectre.SystemPaulinaVianaMachado.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Model.ProdutoModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Model.RelatorioModel;
import com.grupoBlueSpectre.SystemPaulinaVianaMachado.Repository.ProdutoRepository;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoModel> getAllProdutos(){
        return produtoRepository.findAll();
    }
    public Optional<ProdutoModel> getProdutosById(Integer id){
        return produtoRepository.findById(id);
    }
    public ProdutoModel newProduto(ProdutoModel produto){
        return produtoRepository.save(produto);
    }
    public void deleteProduto(Integer id){
        produtoRepository.deleteById(id);
    }//corrigir o updateproduto
    public ProdutoModel updateProduto(ProdutoModel produto , Integer id){
            deleteProduto(produto.getIdProduto());
            newProduto(produto);
            produto.setIdProduto(id);
            return produto;
    }
}
