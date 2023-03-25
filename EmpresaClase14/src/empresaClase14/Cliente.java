package empresaClase14;

public class Cliente {
	private int RUT = 0; // RUT: corresponde a un número menor a 99.999.999
	private String nombres = "";// Nombres
	private String apellidos = ""; // Apellidos
	private String telefono = ""; // Teléfono
	private String AFP = ""; // AFP
	private int sistemaSalud = 0; // Sistema de salud: 1 (Fonasa) o 2 (Isapre)
	private String direccion = ""; // Dirección
	private String comuna = ""; // Comuna
	private int edad = 0; // Edad

	public Cliente(int RUT, String nombres, String apellidos, String telefono, String AFP, int sistemaSalud,
			String direccion, String comuna, int edad) {

		// Valida RUT
		if (RUT < 99999999) {
			this.RUT = RUT;
		} else {
			throw new IllegalArgumentException("El RUT debe ser menor que 99.999.999");
		}

		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.AFP = AFP;

		// Valida sistema de salud
		if (sistemaSalud == 1 || sistemaSalud == 2) {
			this.sistemaSalud = sistemaSalud;

		} else {
			throw new IllegalArgumentException("El sistema de salud solo puede ser 1 o 2.");
		}

		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}

	// METODOS

	public String obtenerNombre() {
		return this.nombres + "" + this.apellidos;

	}
	public String obtenerSistemaSalud() {
		if (this.sistemaSalud == 1) {
			return "Fonasa";
		}else {
			return "Isapre";
		}
		
	}
//	
//	Cliente
//	- obtenerNombre(): retorna un String con el nombre completo del cliente (nombres + 
//	apellidos)
//	- obtenerSistemaSalud(): de acuerdo al valor registrado en el objeto, despliega el tipo de 
//	sistema de salud

	// GETTERS
	public int getRUT() {
		return RUT;
	}

	public String getNombres() {
		return nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getAFP() {
		return AFP;
	}

	public int getSistemaSalud() {
		return sistemaSalud;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public int getEdad() {
		return edad;
	}

	// SETTERS
	public void setRUT(int rUT) {
		RUT = rUT;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setAFP(String aFP) {
		AFP = aFP;
	}

	public void setSistemaSalud(int sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
