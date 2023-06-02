package com.itb.inf2em.comercio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2em.comercio.model.Produto;

@Controller
@RequestMapping("comercio/produto")
public class LojaController {

	@GetMapping("/lister")
	public String litarProduto(){
		
		Produto produto;
		
		produto = new Produto();
		
		produto.nome = "Televisor TCD 75";
		
		return"produtos";
	}
}

