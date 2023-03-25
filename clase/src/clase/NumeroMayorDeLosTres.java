package clase;

import javax.swing.JOptionPane;
public class NumeroMayorDeLosTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2, num3;
		num1 = num2 = num3 = 0;
		String numInput = "";
		
		numInput = JOptionPane.showInputDialog("Ingrese el primer numero");
		num1 =  Double.parseDouble(numInput);
		numInput = JOptionPane.showInputDialog("Ingrese el segundo numero");
		num2 =  Double.parseDouble(numInput);
		numInput = JOptionPane.showInputDialog("Ingrese el tercer numero");
		num3 =  Double.parseDouble(numInput);
		
		
		if(num1 > num2) {
			if(num1 > num3) {
				System.out.println("El numero "+ num1 + " es mayor que " + num2 + " y que " + num3);
			}else {
				System.out.println("El numero "+ num3 + " es mayor que " + num2 + " y que " + num1);
			}
		}else {
			if(num2 > num3) {
				System.out.println("El numero "+ num2 + " es mayor que " + num1 + " y que " + num3);
			}else {
				System.out.println("El numero "+ num3 + " es mayor que " + num2 + " y que " + num1);
			}
		}
	}

}

//Algoritmo NumeroMayorDeLosTres
//
//Definir num1, num2, num3 Como Real
//Escribir "Ingresa el primer numero";
//Leer num1;
//Escribir "Ingresa el segundo numero";
//Leer num2;
//Escribir "Ingresa el tercer numero";
//Leer num3;
//
//Si num1 > num2 Entonces
//	Si num1 > num3 Entonces
//		Escribir "El numero ", num1, "es mayor que ", num2, "y ", num3;
//	SiNo
//		Escribir "El numero ", num3, "es mayor que ", num2, "y ", num1;
//	Fin Si
//
//SiNo
//	Si num2 > num3 Entonces
//		Escribir "El numero ", num2, " es mayor que ", num1, " y ", num3;
//	SiNo
//		Escribir "El numero ", num3, " es mayor que ", num2, " y ", num1;
//	Fin Si
//Fin Si
//FinAlgoritmo
