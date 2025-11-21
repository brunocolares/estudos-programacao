package services;

public interface MensagemTexto extends Mensagem {
	
	@Override
	default void enviar() {
		System.out.println("Enviando mensagem de texto.");
	}
}
