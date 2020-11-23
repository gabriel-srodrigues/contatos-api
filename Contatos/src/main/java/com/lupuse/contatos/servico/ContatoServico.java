package com.lupuse.contatos.servico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lupuse.contatos.entidades.Contato;
import com.lupuse.contatos.interfaces.IContatos;

@Component
public class ContatoServico implements IContatos {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Contato buscaContato(Long id) throws Exception {
		return manager.find(Contato.class, id);
	}

	@Override
	@Transactional
	public Contato salvarContato(Contato contato) throws Exception {
		 return manager.merge(contato);
	}

	@Override
	public List<Contato> listarContatos() throws Exception {
		return manager.createQuery("from Contato", Contato.class).getResultList();
	}

	@Override
	@Transactional 
	public void excluirContato(Contato contato) throws Exception {
		manager.remove(contato);

	}

}
