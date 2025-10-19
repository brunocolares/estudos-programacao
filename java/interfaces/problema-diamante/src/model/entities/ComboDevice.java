package model.entities;

public class ComboDevice extends AbstractDevice implements IPrinter, IScanner{
	
	public ComboDevice(String serialNumber) {
		super(serialNumber);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void processDoc(String doc) {
		System.out.println("Combo processando documento "+ doc);
	}

	@Override
	public void scan() {
		System.out.println("Combo device escaneando.");
	}

	@Override
	public void print(String doc) {
		System.out.println("Combo device imprimindo "+ doc);
		
	}
	
	

}
