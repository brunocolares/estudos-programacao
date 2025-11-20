package entities;

import services.IAlertavel;
import services.ISensor;

public class SensorUmidade implements ISensor, IAlertavel {

	@Override
	public double lerValor() {
		// TODO Auto-generated method stub
		return 30.1;
	}

	@Override
	public double getLimiteCritico() {
		// TODO Auto-generated method stub
		return 85.0;
	}
	
	@Override
	public String tipoSensor() {
		// TODO Auto-generated method stub
		return "Sensor de Umidade";
	}
}
