package abpro2;

import java.util.ArrayList;
import java.util.Scanner;

public class Capacitacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] cliente = new String[5];
		ArrayList<Object> capacitacion = new ArrayList<Object>();

		Scanner sc = new Scanner(System.in);
		String guardaInput = "";
		int guardaInputInt = 0;
		Boolean estaVacio = true;

		// CLIENTE
		System.out.println("DATOS DEl CLIENTE");
		while (estaVacio) {
			System.out.println("Ingresa el RUT del cliente:");
			guardaInput = sc.nextLine().trim();
			estaVacio = guardaInput.length() == 0;

		}
		cliente[0] = guardaInput;
		estaVacio = true;

		while (estaVacio) {
			System.out.println("Ingresa el nombre del cliente:");
			guardaInput = sc.nextLine().trim();
			estaVacio = guardaInput.length() == 0;

		}
		cliente[1] = guardaInput;
		estaVacio = true;

		while (estaVacio) {
			System.out.println("Ingresa la direccion del cliente:");
			guardaInput = sc.nextLine().trim();
			estaVacio = guardaInput.length() == 0;

		}
		cliente[2] = guardaInput;
		estaVacio = true;

		while (estaVacio) {
			System.out.println("Ingresa el telefono del cliente:");
			guardaInput = sc.nextLine().trim();
			estaVacio = guardaInput.length() == 0;

		}
		cliente[3] = guardaInput;
		estaVacio = true;

		while (estaVacio) {
			System.out.println("Ingresa la comuna del cliente:");
			guardaInput = sc.nextLine().trim();
			estaVacio = guardaInput.length() == 0;

		}
		cliente[4] = guardaInput;
		estaVacio = true;

		// DATOS DE CAPACITACION
		System.out.println("DATOS DE CAPACITACION");
		while (estaVacio) {
			System.out.println("Ingresa dia de la capacitación:");
			guardaInput = sc.nextLine().trim();
			estaVacio = guardaInput.length() == 0;

		}
		capacitacion.add(guardaInput);
		estaVacio = true;

		while (estaVacio) {
			System.out.println("Ingresa la hora de la capacitación:");
			guardaInput = sc.nextLine().trim();
			estaVacio = guardaInput.length() == 0;

		}
		capacitacion.add(guardaInput);
		estaVacio = true;

		while (estaVacio) {
			System.out.println("Ingresa el lugar de la capacitación:");
			guardaInput = sc.nextLine().trim();
			estaVacio = guardaInput.length() == 0;

		}
		capacitacion.add(guardaInput);
		estaVacio = true;

		while (estaVacio) {
			System.out.println("Ingresa la cantidad de asistentes de la capacitación:");
			guardaInputInt = sc.nextInt();
			estaVacio = false;
		}
		capacitacion.add(guardaInputInt);
		estaVacio = true;

		// ASISTENTES
		System.out.println("DATOS DE ASISTENTES");
		Object[] asistentes = new Object[(Integer) capacitacion.get(3)];
		ArrayList<Object> asistente = new ArrayList<Object>();

		for (int i = 0; i < (Integer) capacitacion.get(3); i++) {
			while (estaVacio) {
				sc.nextLine();
				System.out.println("Ingresa el nombre del asistente:");
				guardaInput = sc.nextLine();
				estaVacio = guardaInput.length() == 0;
			}
			asistente.add(guardaInput);
			estaVacio = true;
			while (estaVacio) {
				System.out.println("Ingresa la edad del asistente:");
				guardaInputInt = sc.nextInt();
				estaVacio = false;
			}
			asistente.add(guardaInputInt);
			estaVacio = true;
			asistentes[i] = asistente.clone();
			asistente.clear();
			
		}
		
		int nroPersonasMenoresa25 = 0,nroPersonas25_35 = 0,nroPersonasMayores35 = 0;
		for(Object i: asistentes) {
			int edad = (int) ((ArrayList<Object>) i).get(1);
			if(edad<25) {
				nroPersonasMenoresa25++;
			}else if(edad >=25 && edad<35) {
				nroPersonas25_35++;
			}else {
				nroPersonasMayores35++;
			}
		}
		
		System.out.println("----------------------------------- ");
		System.out.println("Datos del cliente: ");
		System.out.println("RUT: " + cliente[0]);
		System.out.println("Nombre: " + cliente[1]);
		System.out.println("Direccion: " + cliente[2]);
		System.out.println("Telefono: " + cliente[3]);
		System.out.println("Comuna: " + cliente[4]);
		
		System.out.println("----------------------------------- ");
		System.out.println("Datos de la capacitación: ");
		System.out.println("Dia de la capacitación: " + capacitacion.get(0));
		System.out.println("Hora de la capacitación: " + capacitacion.get(1));
		System.out.println("Lugar de la capacitación: " + capacitacion.get(2));
		System.out.println("Cantidad de asistentes: " + capacitacion.get(3));
		
		System.out.println("----------------------------------- ");
		System.out.println("Datos de los asistentes: ");
		System.out.println("Numero de asistentes con edad menor a 25: " + nroPersonasMenoresa25);
		System.out.println("Numero de asistentes con edad entre 25 y 35: " + nroPersonas25_35);
		System.out.println("Numero de asistentes con edad mayores a 35: " + nroPersonasMayores35);
sc.close();
	}

}
