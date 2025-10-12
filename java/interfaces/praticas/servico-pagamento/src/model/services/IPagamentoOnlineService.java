package model.services;

public interface IPagamentoOnlineService {
	
	double juros(double valor, int mes);
	double taxaPagamento(double valor);
}
