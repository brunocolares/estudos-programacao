package application;

import model.entities.AbstractDevice;
import model.entities.Printer;

public class Program {
	public static void main(String[] args) {
		Printer printer = new Printer("123");
		printer.processDoc(" My document");
		printer.print("My document");
	}
}
