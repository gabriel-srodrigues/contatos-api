package com.lupuse.contatos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lupuse.contatos.entidades.Contato;
import com.lupuse.contatos.interfaces.IContatos;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping(value = "/contatos")
public class ContatosController {

	@Autowired
	IContatos contato;

	public ContatosController(IContatos contato) {
		this.contato = contato;
	}

	@GetMapping
	public ResponseEntity<List<Contato>> buscarContatos() throws Exception {
		List<Contato> contatos = contato.listarContatos();
		return ResponseEntity.ok(contatos);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Contato> buscaContato(@PathVariable Long id) throws Exception {
		Contato c = contato.buscaContato(id);
		return ResponseEntity.ok(c);
	}
 
	@PostMapping("/adicionar")
	@ResponseStatus(HttpStatus.CREATED)
	public Contato salvarContato(@RequestBody Contato entidade) throws Exception {
		return contato.salvarContato(entidade);
	}
}
