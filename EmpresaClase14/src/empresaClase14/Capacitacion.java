package empresaClase14;

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
		super();
		this.identificador = identificador;
		this.RUTCliente = RUTCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadAsistentes = cantidadAsistentes;
	}

	// GETTERS
	public int getIdentificador() {
		return identificador;
	}

	public int getRUTCliente() {
		return RUTCliente;
	}

	public String getDia() {
		return dia;
	}

	public String getHora() {
		return hora;
	}

	public String getLugar() {
		return lugar;
	}

	public int getDuracion() {
		return duracion;
	}

	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}

	//SETTERS
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public void setRUTCliente(int RUTCliente) {
		this.RUTCliente = RUTCliente;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public void setCantidadAsistentes(int cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}

//	Capacitacion
//	- Identificador: número interno de la capacitación manejado por la empresa
//	- RUT cliente
//	- Día
//	- Hora
//	- Lugar
//	- Duración
//	- Cantidad de asistentes
}
