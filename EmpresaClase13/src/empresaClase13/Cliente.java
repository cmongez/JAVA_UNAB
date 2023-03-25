package empresaClase13;
/**
 * Clase que representa a un Cliente en el sistema de información.
 * 
 * @version 1.0
 * @author grupo
 */

public class Cliente {


	private int RUT = 0; //RUT: corresponde a un número menor a 99.999.999
	private String nombres = "";// Nombres
	private String apellidos = ""; // Apellidos
    private String telefono = ""; // Teléfono
    private String AFP= ""; //AFP
    private int sistemaSalud=0; // Sistema de salud: 1 (Fonasa) o 2 (Isapre)
    private String direccion= ""; // Dirección
    private String comuna= ""; // Comuna
    private int edad= 0; //Edad
    
    
    public Cliente() {
    }

    public Cliente(int RUT, String nombres, String apellidos, String telefono, String AFP, int sistemaSalud,
            String direccion, String comuna, int edad) {
        this.RUT = RUT;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.AFP = AFP;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }

	@Override
	public String toString() {
		return "Cliente [RUT=" + RUT + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", AFP=" + AFP + ", sistemaSalud=" + sistemaSalud + ", direccion=" + direccion + ", comuna=" + comuna
				+ ", edad=" + edad + "]";
	}
    
}
