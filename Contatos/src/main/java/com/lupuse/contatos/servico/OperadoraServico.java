package com.lupuse.contatos.servico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lupuse.contatos.entidades.Operadora;
import com.lupuse.contatos.interfaces.IOperadoras;

@Component
public class OperadoraServico implements IOperadoras {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Operadora buscarOperadora(Long id) throws Exception {
		return manager.find(Operadora.class, id);
	}

	@Override
	public List<Operadora> buscar() throws Exception {
		return manager.createQuery("from Operadora", Operadora.class).getResultList();
	}

	@Override
	@Transactional
	public void excluirOperadora(Operadora operadora) throws Exception {
		manager.remove(operadora);
	}

	@Override
	@Transactional
	public Operadora alterarOperadora(Operadora operadora) throws Exception {
		return manager.merge(operadora);
	}

	@Override
	@Transactional
	public Operadora adicionarOperadora(Operadora entidade) throws Exception {
		return manager.merge(entidade) ; 
	}
}
