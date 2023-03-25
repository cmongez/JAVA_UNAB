package empresaClase14;

import java.time.LocalDate;
import java.time.Period;

public class Usuario {
	private String nombre; // Nombre
	private String fechaNacimiento; // Asumiremos que la fecha de nacimiento sera ingresada en formato yyyy-MM-dd
	private String RUN; // RUN

	public Usuario() {
	}

	public Usuario(String nombre, String fechaNacimiento, String RUN) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.RUN = RUN;
	}

	// METODOS
	public String mostrarEdad() {

		// Fecha de nacimiento
		LocalDate fechaNacimiento = LocalDate.of(2000, 1, 1);

		// Fecha actual
		LocalDate fechaActual = LocalDate.now();

		// Cálculo de la edad
		Period periodo = Period.between(fechaNacimiento, fechaActual);
		int edad = periodo.getYears();

		return "El usuario tiene " + edad + " años";

	}

	// SETTERS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public void setRUN(String RUN) {
		this.RUN = RUN;
	}

	// GETTERS
	public String getNombre() {
		return nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getRUN() {
		return RUN;
	}

}
