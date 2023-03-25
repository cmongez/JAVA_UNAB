package abp7;

import java.util.Scanner;

public class Vocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String texto = "";

		int nroVocales = 0;
		int nroConsonantes = 0;

		String vocales = "[aeiouAEIOU]";

		while (texto.length() == 0) {

			System.out.println("Escribe una cadena de texto");
			texto = sc.nextLine();

			if (texto.length() == 0) {
				System.out.println("La cadena esta vacia, debes escribir algo.");
			}
		}

		for (int i = 0; i < texto.length(); i++) {
			System.out.println(texto.charAt(i));

			if (Character.isLetter(texto.charAt(i))) {

				String letra = texto.charAt(i) + "";
				if (letra.matches(vocales)) {

					nroVocales++;
				} else {
					nroConsonantes++;
				}

			}
		}

		System.out.println("El numero de vocales es: " + nroVocales);

		System.out.println("El numero de consonantes es: " + nroConsonantes);
	}

}
