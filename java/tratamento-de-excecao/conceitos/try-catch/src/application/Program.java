package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* O bloco try-catch abaixo verifica exceções não verificadas em tempo de execução, elas 
		* permitem que o programa seja continua com a falha.
		*/
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position.");
		} catch (InputMismatchException e) {
			System.out.println("Invalid input.");
		}
		
		System.out.println("End of program");
		
		sc.close();
	}

}
