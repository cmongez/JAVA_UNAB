package abpro3;

import java.util.Scanner;

public class Capacitacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] capacitacion = new String[5];
		String guardaInput = "";
		int guardaInputInt;
		Boolean estaVacio = true;

		int acumulaCalificaciones = 0;
		int maxCalificacion = 0;
		int minCalificacion = 0;
		double mediaCalificaciones = 0;
		// DATOS DE CAPACITACION
		Scanner sc = new Scanner(System.in);
		System.out.println("DATOS DE CAPACITACION");
		while (estaVacio) {
			System.out.println("Ingresa dia de la capacitación:");
			guardaInput = sc.nextLine().trim();
			estaVacio = guardaInput.length() == 0;

		}
		capacitacion[0] = guardaInput;
		estaVacio = true;

		while (estaVacio) {
			System.out.println("Ingresa la hora de la capacitación:");
			guardaInput = sc.nextLine().trim();
			estaVacio = guardaInput.length() == 0;

		}
		capacitacion[1] = guardaInput;
		estaVacio = true;

		while (estaVacio) {
			System.out.println("Ingresa el lugar de la capacitación:");
			guardaInput = sc.nextLine().trim();
			estaVacio = guardaInput.length() == 0;

		}
		capacitacion[2] = guardaInput;
		estaVacio = true;

		while (estaVacio) {
			System.out.println("Ingresa la duración de la capacitación:");
			guardaInput = sc.nextLine().trim();
			estaVacio = guardaInput.length() == 0;

		}
		capacitacion[3] = guardaInput;
		estaVacio = true;

		while (estaVacio) {
			System.out.println("Ingresa la cantidad de asistentes de la capacitación:");
			guardaInput = sc.nextLine();
			estaVacio = guardaInput.length() == 0;
		}
		capacitacion[4] = guardaInput;
		estaVacio = true;

		String[][] calificaciones = new String[Integer.parseInt(capacitacion[4])][2];

		for (int i = 0; i < calificaciones.length; i++) {

			while (estaVacio) {
				System.out.println("Ingresa nombre del asistente:");
				guardaInput = sc.nextLine();
				estaVacio = guardaInput.length() == 0;

			}
			estaVacio = true;
			calificaciones[i][0] = guardaInput;

			while (estaVacio) {
				System.out.println("Ingresa calificacion del asistente (numero entero entres 1 y 7):");
				guardaInputInt = sc.nextInt();

				if (guardaInputInt >= 1 && guardaInputInt <= 7) {
					estaVacio = false;
					calificaciones[i][1] = Integer.toString(guardaInputInt);
					acumulaCalificaciones += guardaInputInt;

					if (guardaInputInt > maxCalificacion) {
						maxCalificacion = guardaInputInt;
					}

					if (minCalificacion == 0 || guardaInputInt < minCalificacion) {
						minCalificacion = guardaInputInt;
					}

				} else {
					estaVacio = true;
					System.out.println("El numero ingresado " + guardaInputInt + " no esta en el rango permitido");
				}
				sc.nextLine();
			}
			estaVacio = true;

		}

		mediaCalificaciones = acumulaCalificaciones / Integer.parseInt(capacitacion[4]);

		System.out.println("DATOS DE LA CAPACITACION:");
		for (int i = 0; i < capacitacion.length; i++) {

			System.out.println(capacitacion[i]);

		}

		System.out.println("La media de calificaciones es: " + mediaCalificaciones);

		System.out.println("La maxima calificacion es: " + maxCalificacion);

		System.out.println("La minima calificacion es: " + minCalificacion);

	}

}
