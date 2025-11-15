package entities;

public class PagamentoCartao implements IPagamento, IReembolso {

	@Override
	public void processarPagamento(double valor) {
		System.out.println("Processando pagamento no cartão de R$"+valor);
		
	}
	
	@Override
	public void exibirComprovante() {
		System.out.println("Exibindo comprovante de pagamento no cartão.");
	}
	
}
