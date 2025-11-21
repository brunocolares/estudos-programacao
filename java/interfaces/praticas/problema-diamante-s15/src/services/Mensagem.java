package services;

public interface Mensagem {

	default void enviar() {
		System.out.println("Enviando mensagem genérica.");
	}
}
