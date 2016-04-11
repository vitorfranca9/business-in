package br.com.ative.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ContaAReceber extends BaseEntity {
	private static final long serialVersionUID = 4952747703799215625L;

	@ManyToOne
	@JoinColumn(name="CLIEN")
	private Cliente clien;
	private String sitco;
	private Date dtVen;
	
	public Cliente getClien() {
		return clien;
	}
	public void setClien(Cliente clien) {
		this.clien = clien;
	}
	public String getSitco() {
		return sitco;
	}
	public void setSitco(String sitco) {
		this.sitco = sitco;
	}
	public Date getDtVen() {
		return dtVen;
	}
	public void setDtVen(Date dtVen) {
		this.dtVen = dtVen;
	}
	
}
