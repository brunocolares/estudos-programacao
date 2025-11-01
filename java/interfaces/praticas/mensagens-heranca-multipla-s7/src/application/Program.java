package application;

import entities.IMensagemTexto;
import entities.MensagemTexto;

public class Program {

	public static void main(String[] args) {
		IMensagemTexto msg = new MensagemTexto();
		msg.enviarMensagem();

	}

}
