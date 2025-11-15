package entitie;

public class Produto implements Comparable<Produto>{
	
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto() {
		
	}
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public int compareTo(Produto produto) {
		int compareName = this.nome.compareToIgnoreCase(produto.nome);
		int ordena = compareName;
		if(ordena == 0) {
			if(this.preco < produto.preco) {
				ordena = -1;
			} else if(this.preco > produto.preco) {
				ordena = 1;
			} else {
				ordena = 0;
			}
		}
		
		if(ordena == 0)  {
			if(this.quantidade > produto.quantidade) {
				ordena = -1;
			} else if(this.quantidade < produto.quantidade) {
				ordena = 1;
			} else {
				ordena = 0;
			}
		}
		return ordena;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}
	
	
}
