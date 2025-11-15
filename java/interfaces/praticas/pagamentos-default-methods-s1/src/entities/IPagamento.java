package entities;

public interface IPagamento {
	void processarPagamento(double valor);
	default void exibirComprovante() {
		System.out.println("Exibindo comprovante padrão.");
	}
}
 