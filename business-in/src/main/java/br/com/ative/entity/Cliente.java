package br.com.ative.entity;

import javax.persistence.Entity;

@Entity
public class Cliente extends BaseEntity {
	private static final long serialVersionUID = -9173012138088452380L;

	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
