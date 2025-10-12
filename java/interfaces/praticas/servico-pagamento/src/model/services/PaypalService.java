package model.services;

public class PaypalService implements IPagamentoOnlineService {

	@Override
	public double juros(double valor, int mes) {
		return (valor * 0.01) * mes;
	}
	
	@Override
	public double taxaPagamento(double valor) {
		return valor + (valor * 0.02);
	}
}
