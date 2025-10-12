package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Parcela;
import model.services.ContratoService;
import model.services.PaypalService;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato: ");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Data(dd/MM/yyyy): ");
		LocalDate data = LocalDate.parse(sc.nextLine(), dtf);
		System.out.print("Valor do contrato: ");
		double valorTotal = sc.nextDouble();
		System.out.print("Entre com o número de parcelas: ");
		int parcelas = sc.nextInt();
		ContratoService service = new ContratoService(new PaypalService());
		Contrato contrato = new Contrato(numero, data, valorTotal);
		service.processarContrato(contrato, parcelas);
		
		System.out.println("Parcelas geradas: ");
		for(Parcela parcela : contrato.getParcelas()) {
			System.out.println(String.format("%s - %.2f", dtf.format(parcela.getData()), parcela.getValor()));
		}
		
		sc.close();
	}

}
