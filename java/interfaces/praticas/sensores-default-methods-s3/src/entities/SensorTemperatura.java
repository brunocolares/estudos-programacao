package entities;

import services.IAlertavel;
import services.ISensor;

public class SensorTemperatura implements ISensor, IAlertavel {

	@Override
	public double lerValor() {
		return 100;
	}

	@Override
	public double getLimiteCritico() {
		return 70.8;
	}

	@Override
	public String tipoSensor() {
		return "Sensor de Tempetura";
	}
	
	
}
