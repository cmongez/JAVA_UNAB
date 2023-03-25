package ejemplos;

import java.util.Scanner;

public class Ejemplo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Indica segun el ingreso de numeros indicado por teclado, 
		//cual es el numero mayor
		 int valorMayor = 0;
	        
	        Scanner entrada = new Scanner(System.in);
	        
	        System.out.print("Ingrese la cantidad de numeros de su vector: ");
	        int posiciones = entrada.nextInt();
	        //Faltaba intercambiar el 1 por posiciones a la hora de crear el array.
	        int [] vector = new int[posiciones];
	        System.out.println("");
	        for (int i = 0; i < posiciones; i++) {
	            System.out.print("Ingrese el numero de la posicion "+(i+1)+": ");
	            vector[i] = entrada.nextInt();
	        }
	        
	        for (int i = 0; i < vector.length; i++) {
	            
	            for (int j = 0; j < vector.length; j++) {
	                if (vector[j] > vector[i]) {
	                    valorMayor = vector[j];
	                }
	            }   
	        }
	        System.out.println("\nEl numero mayor de su vector es: "+valorMayor);   

	}

}