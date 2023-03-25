package empresaClase13;
/**
 * Clase que representa a un Usuario en el sistema de información.
 * 
 * @version 1.0
 * @author grupo
 */
public class Usuario {

	private String nombre; // Nombre
    private String fechaNacimiento; // Fecha de nacimiento
    private String RUN; // RUN

    public Usuario() {
    }

    public Usuario(String nombre, String fechaNacimiento, String RUN) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.RUN = RUN;
    }

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", RUN=" + RUN + "]";
	}

   
	
}


