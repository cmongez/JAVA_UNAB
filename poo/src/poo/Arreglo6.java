package poo;

import javax.swing.JOptionPane;

public class Arreglo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creamos las variables atributos
		int[] arreglo = new int[10];
		int par = 0, impar = 0, entrada, vector;

		// Asignamos los valores
		vector = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del vector"));

		// Llenando el vector
		for (int i = 0; i < vector; i++) {
			entrada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento"));
			arreglo[i] = entrada;
			if (arreglo[i] % 2 == 0) {
				par++;
			} else {
				impar++;
			}

		}
		int[] arreglo_par = new int[par];
		int[] arreglo_impar = new int[impar];

		// Se crea el tamaño del vector par y se rellena
		for (int i = 0; i < par;) {
			for (int j = 0; j < vector; j++) {
				if (arreglo[j] % 2 == 0) {
					arreglo_par[i] = arreglo[j];
					i++;
				}
			}

		}
		// Se crea el tamaño del vector impar y se llena
		for (int i = 0; i < impar;) {
			for (int j = 0; j < vector; j++) {

				if (arreglo[j] % 2 != 0) {
					arreglo_impar[i] = arreglo[j];
					i++;
				}
			}
		}
		// Se imprime el arreglo
		System.out.println("\t.:RESULTADO ARREGLOS:." + "\n");
		System.out.println(".:Arreglos pares " + par + " cantidad de elementos:.");
		for (int i = 0; i < par; i++) {
			System.out.println("[" + arreglo_par[i] + "]");
		}

		System.out.println("\n");
		System.out.println(".:Arreglos impares " + impar + " cantidad de elementos:.");
		for (int i = 0; i < impar; i++) {
			System.out.println("[" + arreglo_impar[i] + "]");
		}
		System.out.println("\n");

		for (int i = 0; i < vector; i++) {
			System.out.println("[" + arreglo[i] + "]");

		}
		System.out.println("\n");

	}

}
