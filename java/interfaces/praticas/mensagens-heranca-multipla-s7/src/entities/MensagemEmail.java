package entities;

public class MensagemEmail implements IMensagemEmail {
	
	@Override
	public void enviarMensagem() {
		System.out.println("Enviando mensagem de email.");
		
	}

}
