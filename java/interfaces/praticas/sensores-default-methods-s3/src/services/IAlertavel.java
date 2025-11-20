package services;

public interface IAlertavel {
	
	String tipoSensor();
	
	default void emitirAlerta(double valor) {
		System.out.println("Alerta: Valor "+ valor + " crítico.");
	}
}
