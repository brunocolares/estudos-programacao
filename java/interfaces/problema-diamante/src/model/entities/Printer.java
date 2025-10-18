package model.entities;

public class Printer extends AbstractDevice implements IPrinter {

	public Printer(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void print(String doc) {
		System.out.println("Printer imprimindo "+ doc);
		
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Printer processando documento "+ doc);
		
	}
	
}
