package entities;

public class PagamentoBoleto implements IPagamento {

	@Override
	public void processarPagamento(double valor) {
		System.out.println("Processando pagamento no boleto de R$"+valor);
		
	}
}
