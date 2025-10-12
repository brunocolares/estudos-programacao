package model.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Contrato {
	
	private int numero;
	private LocalDate data;
	private double valorTotal;
	private List<Parcela> parcelas;
		
	public Contrato(int numero, LocalDate data, double valorTotal) {
		this.numero = numero;
		this.data = data;
		this.valorTotal = valorTotal;
	}

	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public double getValorTotal() {
		return valorTotal;
	}
	
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public List<Parcela> getParcelas() {
		return parcelas;
	}
	
	public void setParcelas(List<Parcela> parcelas) {
		this.parcelas = parcelas;
	}
	
	
}
