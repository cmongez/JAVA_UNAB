package poo;

public class Arreglo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nombres = {"Fernando", "Camilo", "Mario", "Maria", "Susana"};
//		System.out.println(nombres[0]);
//		System.out.println(nombres[1]);
//		System.out.println(nombres[2]);
//		System.out.println(nombres[3]);
//		System.out.println(nombres[4]);
		
//		for(int i=0;i<nombres.length;i++) {
//			System.out.println("El nombre ingresado es: " + nombres[i]);
//		}
		
//		El forEach de Java
		for(String i:nombres) {
			System.out.println("El nombre ingresado es: " + i);
		}
		
	}

}
