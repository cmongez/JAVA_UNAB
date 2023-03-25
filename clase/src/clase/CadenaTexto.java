package clase;
import java.util.Scanner;

public class CadenaTexto {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hola;
		
		hola= "saludoooo";
		Scanner texto = new Scanner(System.in);
		System.out.println("Ingrese su nombre: ");
		String nombre = texto.nextLine();
		
		System.out.println("La cadena tiene "+nombre.length()+"caracteres");

	}

}
