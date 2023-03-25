package poo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Arreglo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int nIngresos;
		
		nIngresos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de datos solicitados"));
		char[] letras= new char[nIngresos];
		System.out.println("Digite los ingresos del arreglo: ");
		for(int i=0; i<nIngresos; i++) {
			System.out.println(i+1 + " .- Ingrese un caracter: ");
			letras[i] = entrada.next().charAt(0);
		}
		
		System.out.println("Los caracteres del arreglo son: ");
		for(int i=0; i<nIngresos; i++) {
			System.out.print(letras[i] + " ");
		}

	}

}
