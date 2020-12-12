package dominio;

import java.util.Date;

public class Reserva {

	private Date fecha;
	private String datosCliente;

	/**
	 * @param fecha
	 * @param datosCliente
	 */
	public Reserva(Date fecha, String datosCliente) {
		this.fecha = fecha;
		this.datosCliente = datosCliente;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDatosCliente() {
		return this.datosCliente;
	}

	public void setDatosCliente(String datosCliente) {
		this.datosCliente = datosCliente;
	}

}