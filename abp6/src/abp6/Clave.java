package abp6;
import java.util.Scanner;

public class Clave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String clave = "secreta";	
		String claveIngresada="";
		Boolean esClaveCorrecta = false;
		int intentos= 0;
		
		do {
			System.out.println("Ingresa tu contraseña");
			claveIngresada = sc.nextLine();
			esClaveCorrecta = claveIngresada.equals(clave);
			if(!esClaveCorrecta) {
				System.out.println("Clave incorrecta");
				System.out.println(esClaveCorrecta);
				intentos++;
				if(intentos == 3 ) {
					System.out.println("Intentaste demasiadas veces, lo siento. Cerrando programa.");
					break;
				}
			}else {
				System.out.println("La clave  ingresada es correcta.");
			}
			
		}while(!esClaveCorrecta);
		
		

	}

}
