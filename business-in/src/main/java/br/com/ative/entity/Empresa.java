package br.com.ative.entity;

import javax.persistence.Entity;

@Entity
public class Empresa extends BaseEntity {
	private static final long serialVersionUID = -5237656083005955156L;

	private String razao;

	public String getRazao() {
		return razao;
	}

	public void setRazao(String razao) {
		this.razao = razao;
	}
	
}
