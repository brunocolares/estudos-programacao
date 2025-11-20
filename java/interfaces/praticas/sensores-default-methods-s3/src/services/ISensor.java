package services;

public interface ISensor {
	double lerValor();
	
	default boolean isCritico(double valor) {
		if(valor > getLimiteCritico()) {
			return true;
		}
		return false;
	}
	
	double getLimiteCritico();
}
