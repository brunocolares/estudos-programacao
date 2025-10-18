package model.entities;

public class Scanner extends AbstractDevice implements IScanner {

	public Scanner(String serialNumber) {
		super(serialNumber);
	}
	
	@Override
	public void scan() {
		System.out.println("Scanner escaneando...");
		
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processando documento "+ doc);
		
	}
}
