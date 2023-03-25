package abp5;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2;		
		double resultado = 0;
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Ingrese el primer numero."); 
		num1 = sc.nextInt();
		System.out.println("Ingrese el segundo numero.");
		num2 = sc.nextInt();
		
		System.out.println("Ingrese el signos aritméticos de la operación que desea realizar.\n" 
				+ "Suma (+)\n"+ "Resta (-)\n"
				+ "Multiplicación (x)\n"
				+ "Division (:)\n"
				+ "Modulo (/)\n");
		String operacion = sc.next();
		
		switch(operacion) {
		  case "+":
			  resultado = num1 + num2;
			  break;
		  case "-":
			  resultado = num1 - num2;
			  break;
		  case "x":
			  resultado = num1 * num2;
			  break;
		  case ":":
			  resultado = num1 / num2;
			    break;
		  case "/":
			  resultado = num1 % num2;
			    break;
		  default:
		    System.out.println("Ingrese un simbolo de operación valido");
		}
		
	 System.out.println("El resultado de su operación ("+ operacion + ") entre " + num1 + " y " + num2 + " es: "+ resultado);
		
	}

}

//Desarrolle una aplicación que simule una calculadora. Esta nos pedirá 2 operandos, ambos de tipo
//entero (int) y un signo aritmético a modo de texto (Sting); según este último valor se realizará la 
//operación correspondiente. 
//Finalmente, el programa mostrará por consola el resultado. Los signos aritméticos disponibles son 
//los siguientes:
//• Suma (+)
//• Resta (-)
//• Multiplicación (x)
//• División (:)
//• Módulo (/)
//Nota 1: Los signos indicados en las operaciones anteriores no son los mismos que los utilizados en 
//el lenguaje de programación Java
//Nota 2: Para ingresar valores a través de teclado, use la clase Scanner (vea el enlace en las 
//referencias)