package clase;
import java.util.Scanner;
public class Exponente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num=new Scanner(System.in);
		System.out.println("Ingresa un numero");
		double numero=num.nextInt();
		double exponente=3;
		
		int resultado=(int)Math.pow(numero, exponente);
		System.out.println("El numero ingresado elevado al cubo es : "+resultado);
	}

}