package com.itb.inf2em.comercio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.model.IModel;

import com.itb.inf2em.comercio.model.Produto;

@Controller
@RequestMapping("comercio/produto")
public class LojaController {

	List<Produto> listaDeProdutos = new ArrayList<Produto>();
	
	@GetMapping("/lister")
	public String litarProduto(Model model){
		
		Produto produto;
		
		Produto produto = new Produto();
		
		produto.setId(20l);
		produto.setNome("Televisor Samsung");
		produto.setDescricao("Televisor Tela Plana de Plasma");
		produto.setPreco(5467.99);
		produto.setCodigoDeBarras("DHUVSDFHGASFUREYW2689");
		
		Produto produto2= new Produto();
		produto2.setId(22l);
		produto2.setNome ("Maquina de Lavar 151");
		produto2.setDescricao("Maquina de lavar Brastemp");
		produto2.setPreco(2467.99);
		produto2.setCodigoDeBarras("HFDUEWVFIWEFV4389");
		
		listaDeProdutos.add(produto1);
		listaDeProdutos.add(produto2);
		
		model.addAttribute("listaDeProdutos", listaDeProdutos);
		return"produtos";
	}
}

