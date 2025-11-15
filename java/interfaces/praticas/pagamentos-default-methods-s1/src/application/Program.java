package application;

import java.util.ArrayList;
import java.util.List;

import entities.IPagamento;
import entities.IReembolso;
import entities.PagamentoBoleto;
import entities.PagamentoCartao;

public class Program {
	public static void main(String[] args) {
		List<IPagamento> pagamentos = new ArrayList<>();
		pagamentos.add(new PagamentoCartao());
		pagamentos.add(new PagamentoBoleto());
		
		for(IPagamento pagamento : pagamentos) {
			if(pagamento instanceof PagamentoBoleto) {
				pagamento.processarPagamento(100.0);
			} else {
				pagamento.processarPagamento(105.39);
				IReembolso reembolso = (PagamentoCartao) pagamento;
				reembolso.estornarPagamento();
			}
			
			pagamento.exibirComprovante();
		}
	}
}
