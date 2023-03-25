package abp10;

public class Trabajador {

	String nombres = "";
	String apellidos = "";
	String RUN = "";
	String telefono = "";
	int edad = 0;

	Trabajador() {

	}

	Trabajador(String nombres, String apellidos, String RUN, String telefono, int edad) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.RUN = RUN;
		this.telefono = telefono;
		this.edad = edad;
	}

	public String nombreCompleto() {
		return this.nombres + " " + this.apellidos;
	}

	public int descomponerRun() {
		int runDescompuesto = -1;

		if (this.RUN.contains("-")) {
			int index = this.RUN.indexOf("-");
			runDescompuesto = Integer.parseInt(this.RUN.substring(0, index));

			return runDescompuesto;
		}
		return runDescompuesto;

	}

	@Override
	public String toString() {
		return "Trabajador [nombres=" + nombres + ", apellidos=" + apellidos + ", RUN=" + RUN + ", telefono=" + telefono
				+ ", edad=" + edad + "]";
	}
// Se deja comentada el metodo main que se uso para comprobar el funcionamiento de la clase 
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Trabajador trab1 = new Trabajador("Cesar", "Augusto", "12345678-9", "912345678", 26);
//
//		System.out.println(trab1.nombreCompleto() + trab1.toString() + trab1.descomponerRun());
//
//	}

}
