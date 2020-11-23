package com.lupuse.contatos.controllers;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lupuse.contatos.entidades.Operadora;
import com.lupuse.contatos.interfaces.IOperadoras;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping(value = "/operadoras")
public class OperadorasController {

	IOperadoras operadora;

	public OperadorasController(IOperadoras operadora) {
		this.operadora = operadora;
	}
	
	@GetMapping
	public List<Operadora> buscar() throws Exception{
		return operadora.buscar();
	}
	
	@GetMapping("/{id}")
	public Operadora buscarOperadora(@PathVariable Long id) throws Exception{
		return operadora.buscarOperadora(id);
	}
	
	@PostMapping("/adicionar")
	public Operadora adicionarOperadora(@PathVariable Operadora entidade) throws Exception{
		return operadora.adicionarOperadora(entidade);
	}
	
}
