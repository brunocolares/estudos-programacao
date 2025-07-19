package entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Acesso {

	private String usuario;
	private LocalDate data;
	private LocalTime horario;
	private String ip;
	
	public Acesso(String usuario, LocalDate data, LocalTime horario, String ip) {
		this.usuario = usuario;
		this.data = data;
		this.horario = horario;
		this.ip = ip;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public LocalTime getHorario() {
		return horario;
	}
	
	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}
	
	public String getIp() {
		return ip;
	}
	
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	

	@Override
	public String toString() {
		return "Acesso [usuario=" + usuario + ", data=" + data + ", horario=" + horario + ", ip=" + ip + "]";
	}
	
	
}
