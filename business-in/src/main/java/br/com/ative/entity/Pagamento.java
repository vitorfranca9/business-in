package br.com.ative.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pagamento implements IEntity{
	private static final long serialVersionUID = 3440606231247740026L;

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private Double valor;
	
	@Enumerated(EnumType.ORDINAL)
	private TipoPagamento tipo;
	
	@Override
	public Serializable getId() {
		return id;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public TipoPagamento getTipo() {
		return tipo;
	}
	public void setTipo(TipoPagamento tipo) {
		this.tipo = tipo;
	}

}
