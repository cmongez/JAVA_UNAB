package abp9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Pares {

	public static void calcular(ArrayList<Integer> coleccion) {
		int mayor = 0;
		int menor = 0;
		int acumulador = 0;
		double promedio;
		int largo = coleccion.size();
		if (largo >= 3) {
			for (int num : coleccion) {

				if (num > mayor) {
					mayor = num;

				}
				if (num < menor || menor == 0) {
					menor = num;

				}

				acumulador += num;
			}
			promedio = (double) acumulador / largo;

			System.out.println("El numero mayor es: " + mayor);

			System.out.println("El numero menor es: " + menor);

			System.out.println("El promedio es: " + promedio);
		} else {
			System.out.println("No se pueden realizar los calculos porque ingresaste menos de 3 numeros");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> enteros = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int numero = -1;

		while (numero != 0) {

			System.out.println("Ingresa un numero entero o 0 para salir.");
			numero = sc.nextInt();
			if (numero == 0) {
				break;
			}
			enteros.add(numero);
		}
		System.out.println("Calculando usando la totalidad de los numeros");
		calcular(enteros);

		ArrayList<Integer> enterosImpares = enteros.stream().filter(x -> x % 2 != 0)
				.collect(Collectors.toCollection(ArrayList::new));

		System.out.println("Calculando usando solo los numeros impares");
		calcular(enterosImpares);

	}
}
