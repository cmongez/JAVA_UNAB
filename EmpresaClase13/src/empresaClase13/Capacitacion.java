package empresaClase13;

/**
 * Clase que representa una Capacitación en el sistema de información.
 * 
 * @version 1.0
 * @author grupo
 */
public class Capacitacion {
	private int identificador = 0;
	private int RUTCliente = 0;
	private String dia = "";
	private String hora = "";
	private String lugar = "";
	private int duracion = 0;
	private int cantidadAsistentes = 0;

	

	public Capacitacion() {
	}

	public Capacitacion(int identificador, int RUTCliente, String dia, String hora, String lugar, int duracion,
			int cantidadAsistentes) {
		this.identificador = identificador;
		this.RUTCliente = RUTCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadAsistentes = cantidadAsistentes;
	}
	
	@Override
	
	public String toString() {
		return "Capacitacion [identificador=" + identificador + ", RUTCliente=" + RUTCliente + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion + ", cantidadAsistentes="
				+ cantidadAsistentes + "]";
	}
}

