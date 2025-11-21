package services;

public interface MensagemEmail extends Mensagem {

	@Override
	default void enviar() {
		System.out.println("Enviando mensagem de email.");
	}
}
