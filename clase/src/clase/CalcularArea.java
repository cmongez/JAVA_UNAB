package clase;

import javax.swing.JOptionPane;
public class CalcularArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double base, altura, areaRectangulo, areaCuadrado = 0;
		String baseInput, alturaInput = "";

		System.out.println("Calcular Area \n"
				+ "\"ingrese el numero 1 para calcular el area del cuadrado\"");
		
		String var =  JOptionPane.showInputDialog("Ingrese el numero 1 para calcular el area del cuadrado");
		int numero = Integer.parseInt(var);
		if(numero == 1 ) {
			System.out.println("Area del cuadrado \n ------------------------------- \n ");
			baseInput = JOptionPane.showInputDialog("Ingrese una de las medidas del cuadrado");
			base =  Double.parseDouble(baseInput);
			areaCuadrado = base*base;
			System.out.println("Area del cuadrado: " + areaCuadrado);
		} else {
			System.out.println("Area del rectangulo \n ------------------------------- ");
			baseInput = JOptionPane.showInputDialog("Ingrese la base del rectangulo");
			base =  Double.parseDouble(baseInput);
			alturaInput = JOptionPane.showInputDialog("Ingrese la altura del rectangulo");
			altura =  Double.parseDouble(alturaInput);
			areaRectangulo = base * altura;
			System.out.println("El area del rectangulo es: " + areaRectangulo);
			
		}
		
	}

}



