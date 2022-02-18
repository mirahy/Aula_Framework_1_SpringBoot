package com.example.introducao.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tecnico")
public class Tecnico extends Pessoa<Long> {
	private static final long serialVersionUID = 1L;
	
	private boolean arbitro;

	public boolean isArbitro() {
		return arbitro;
	}

	public void setArbitro(boolean arbitro) {
		this.arbitro = arbitro;
	}

}
