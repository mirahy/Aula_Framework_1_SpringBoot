package com.example.introducao.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_atleta")
public class Atleta extends Pessoa<Long>{
	private static final long serialVersionUID = 1L;
	
	@Column(name = "data_nascimento")
	private String dataNascimento;

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
