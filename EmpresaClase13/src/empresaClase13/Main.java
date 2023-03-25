package empresaClase13;

import empresaClase13.Capacitacion;
import empresaClase13.Cliente;
import empresaClase13.Usuario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cliente1 = new Cliente(12345678, "Cesar", "Mongez", "987654321", "1", 1,
	           "AV Libertad","Viña del Mar", 26);
		cliente1.toString();
		
		Capacitacion capacitacion1 = new Capacitacion(1, 32145689, "12-01-22", "13:20", "Plaza", 90, 10);
		capacitacion1.toString();
		
		Usuario usuario1 = new Usuario("Jose", "12-02-96", "15-15-10");
		usuario1.toString();
	};

}
