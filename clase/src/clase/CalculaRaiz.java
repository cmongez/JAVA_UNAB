package clase;
import java.util.Scanner;

public class CalculaRaiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num=new Scanner(System.in);
		System.out.println("Ingrese su numero");
		//Se transforma la variable num a tipo de dato double (con decimal)
		double numero=num.nextInt();
		//Math nos sirve para realizar distintos calculos predeterminados
		//sqrt es un atributo de la clase Math que calcula la raíz
		numero=Math.sqrt(numero);
		System.out.println(numero);

	}

}


