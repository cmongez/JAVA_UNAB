package ejemplos;

import java.util.Scanner;

public class Ejemplo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//El ejercicio de mostrar en pantalla todas las cifras sobre 5000
		
		  Scanner entrada = new Scanner(System.in);
		  //Se crea variable String acumulador.
	        String acumulador = "";
	        
	        System.out.println("Ingrese la cantidad de ventas");
	        
	        int ventasSelecionadas = entrada.nextInt();

	        //Se cambia el 1 por ventasSelecionadas
	        int numeroDeVentas [] = new int [ventasSelecionadas];
	        
	        
	        for (int i = 0; i < ventasSelecionadas; i++) {
	            
	            System.out.println("Ingrese la venta numero: " + (i+1));
	            numeroDeVentas[i] = entrada.nextInt();
	            
	        }
	        
	        for (int i = 0; i < ventasSelecionadas; i++) {
	            
	        	
	        	//Se cambia menores de 5000 por mayores a 5000
	            if(numeroDeVentas[i] > 5000){
	            
	            acumulador =  acumulador +  (numeroDeVentas[i]) + ",";
	            }
	            
	        }
	        
	        
	        System.out.println("Las ventas que cumplen los requisitos son: ");
	        System.out.println(acumulador);

	}

}






