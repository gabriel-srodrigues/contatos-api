package com.lupuse.contatos.entidades;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "contato")

public class Contato { 
 
	@Id
	@Column(name = "ID") 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "ID_PUBLICO")
	private String idPublico;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "TELEFONE")
	private String telefone;
	 
	@Column(name = "DATA")
	private Date data; 

	@ManyToOne
	@JoinColumn(name = "OPERADORA")
	private Operadora operadora;
	
	public Long getId() { 	
		return id; 
	} 

	public void setId(Long id) { 
		this.id = id; 
	}

	public String getIdPublico() {
		return idPublico;
	}

	public void setIdPublico(String idPublico) {
		this.idPublico = idPublico;
	}
 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) { 
		this.nome = nome;
	} 

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	} 

	
	public Operadora getOperadora() {
		return operadora;
	}

	public void setOperadora(Operadora operadora) {
		this.operadora = operadora;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((idPublico == null) ? 0 : idPublico.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idPublico == null) {
			if (other.idPublico != null)
				return false;
		} else if (!idPublico.equals(other.idPublico))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}


}
