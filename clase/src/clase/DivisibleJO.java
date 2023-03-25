package clase;

import javax.swing.JOptionPane;

public class DivisibleJO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = JOptionPane.showInputDialog("Ingresa un numero");
		//pasamos el String a int
		int numero = Integer.parseInt(texto);
		if(numero%2==0) {
			System.out.println("El numero "+numero+" es divisible por 2");
		}else {
			System.out.println("El numero "+numero+" no es divisible por 2");
			
		}
		
	}

}

