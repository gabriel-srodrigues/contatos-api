package com.lupuse.contatos.interfaces;

import java.util.List;

import com.lupuse.contatos.entidades.Contato;

public interface IContatos {

	public Contato buscaContato(Long id) throws Exception;
	public Contato salvarContato(Contato contato) throws Exception;
	public List<Contato> listarContatos() throws Exception;
	public void excluirContato(Contato contato) throws Exception;
}
