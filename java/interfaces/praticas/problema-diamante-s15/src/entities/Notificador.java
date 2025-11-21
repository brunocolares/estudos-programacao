package entities;

import services.Mensagem;
import services.MensagemEmail;
import services.MensagemTexto;

public class Notificador implements MensagemTexto, MensagemEmail {
	
	@Override
	public void enviar() {
		MensagemTexto.super.enviar();
	}
}
