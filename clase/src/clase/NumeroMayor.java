package clase;

public class NumeroMayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=15;
		int num2=15;
		if(num1>=num2) {
			if(num1==num2) {
				System.out.println("Los numeros " + num1+ " y " + num2 + " son iguales");
			}else {
				System.out.println("El numero " + num1 + " es mayor que el " + num2);
			}
		}else {
			System.out.println("El numero " +num2 + " es mayor que el numero " + num1);
		}
	}

}
