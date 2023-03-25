package clase;
import java.util.Scanner;
public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa un numero ");
		int numero=sc.nextInt();
		
		if(numero%2==0) {
			System.out.println("El numero "+numero+ " es divisible por 2");
		}else {
			System.out.println("El numero "+numero+" no es divisible por 2");
		}
	}

}
