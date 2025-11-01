package entities;

public class MensagemMulticanal implements IMensagemTexto, IMensagemEmail {

	@Override
	public void enviarMensagem() {
		System.out.println("Enviando mensagem multicanal.");
	}

}
