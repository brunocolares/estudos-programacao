package model.services;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import model.entities.Contrato;
import model.entities.Parcela;

public class ContratoService {
	
	private IPagamentoOnlineService pagamentoOnlineService;
	
	public ContratoService(IPagamentoOnlineService pagamentoOnlineService) {
		this.pagamentoOnlineService = pagamentoOnlineService;
	}

	public void processarContrato(Contrato contrato, int meses) {
		LocalDate data = contrato.getData();
		List<Parcela> parcelas = new ArrayList<>();
		double valorParcela = contrato.getValorTotal() / meses;
		for(int i = 1; i <= meses; i++) {
			double juros = pagamentoOnlineService.juros(valorParcela, i);
			double valorParcelaComTaxa = pagamentoOnlineService.taxaPagamento(valorParcela + juros);
			data = data.plus(1, ChronoUnit.MONTHS);
			parcelas.add(new Parcela(data, valorParcelaComTaxa));
		}
		contrato.setParcelas(parcelas);
	}
}
