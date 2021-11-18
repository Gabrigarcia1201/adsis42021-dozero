package com.unicesumar.adsis4s2021.dozero.meuPessoa;

import javax.persistence.Entity;

import org.springframework.web.bind.annotation.RequestMapping;


@Entity
public class MeuAluno extends MeuPapel {
	private String ra;
	
	public String getRa() {
		return ra;
	}
	
	public void setRa(String ra) {
		this.ra = ra;
	}

}
