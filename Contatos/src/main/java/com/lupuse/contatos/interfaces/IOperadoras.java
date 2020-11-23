package com.lupuse.contatos.interfaces;

import java.util.List;

import com.lupuse.contatos.entidades.Operadora;

public interface IOperadoras {

	public Operadora buscarOperadora(Long id) throws Exception;
	public List<Operadora> buscar() throws Exception;
	public void excluirOperadora(Operadora operadora) throws Exception;
	public Operadora alterarOperadora(Operadora operadora) throws Exception;
	public Operadora adicionarOperadora(Operadora entidade) throws Exception;
	
}
