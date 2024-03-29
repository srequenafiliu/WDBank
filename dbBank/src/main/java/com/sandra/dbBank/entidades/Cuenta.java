package com.sandra.dbBank.entidades;

import java.math.BigDecimal;
import java.util.Objects;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Cuenta {
	
	private Integer id;
	private Cliente cliente;
	private BigDecimal saldo;
	
	public Cuenta(Integer id) {
		this.id = id;
		this.cliente = null;
		this.saldo = new BigDecimal(1000.00);
	}
	
	public Cuenta(Cliente cliente) {
		this.id = null;
		this.cliente = cliente;
		this.saldo = new BigDecimal(1000.00);
	}
	
	public Cuenta(Integer id, Cliente cliente, BigDecimal saldo) {
		this.id = id;
		this.cliente = cliente;
		this.saldo = saldo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuenta other = (Cuenta) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return String.format("· Cuenta nº%d (Saldo: %.2f€)", id, saldo);
	}
	
}
