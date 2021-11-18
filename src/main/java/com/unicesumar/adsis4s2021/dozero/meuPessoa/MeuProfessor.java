package com.unicesumar.adsis4s2021.dozero.meuPessoa;

import javax.persistence.Entity;

@Entity
public class MeuProfessor extends MeuPapel {
	private String ctps;
	
	public String getCtps() {
		return ctps;
	}
	
	public void setCtps(String ctps) {
		this.ctps = ctps;
	}

	
}

