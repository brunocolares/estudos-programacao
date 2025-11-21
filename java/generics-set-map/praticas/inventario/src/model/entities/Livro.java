package model.entities;

public class Livro implements Comparable<Livro>{

	private String nome;
	private String tipo;
	private Double valor;
	
	public Livro() {
	}
	
	public Livro(String nome, String tipo, Double valor) {
		this.nome = nome;
		this.tipo = tipo;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public int compareTo(Livro o) {
		return valor.compareTo(o.valor);
	}

	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", tipo=" + tipo + ", valor=" + valor + "]";
	}
}
