package application;

import entities.SensorTemperatura;
import entities.SensorUmidade;

public class Program {
	public static void main(String[] args) {
		SensorTemperatura sensor1 = new SensorTemperatura();
		
		double valorLido = sensor1.lerValor();
		if(sensor1.isCritico(valorLido)) {
			sensor1.emitirAlerta(valorLido);
		}
		
		SensorUmidade sensor2 = new SensorUmidade();
		valorLido = sensor2.lerValor();
		if(sensor2.isCritico(valorLido)) {
			sensor2.emitirAlerta(valorLido);
		}
	}
}
