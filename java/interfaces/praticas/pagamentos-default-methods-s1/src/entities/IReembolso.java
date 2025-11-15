package entities;

public interface IReembolso {
	default void estornarPagamento() {
		System.out.println("Estornando pagamento...");
	}
}
