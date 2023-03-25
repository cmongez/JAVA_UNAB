package clase;

import java.util.ArrayList;

public class ArregloEdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad [] = new int [5];
		
		edad[0]=10;
		
		System.out.println(edad[0]);
		
		String [] nombres = new String [] {"Cesar", "Augusto"};
		
		System.out.println(nombres[0]);
		
		ArrayList<Integer> listaNums = new
				ArrayList<Integer>();
				listaNums.add(50);
				System.out.println(listaNums.get(0));
				listaNums.set(0, 10);
		System.out.println(listaNums);
	}

}
//Desarrolle un programa en lenguaje Java que muestre la declaración, creación,
//inicialización y consulta de un arreglo llamado edadcon 3 posiciones de tipo entero.