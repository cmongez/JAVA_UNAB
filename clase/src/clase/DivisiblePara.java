package clase;

public class DivisiblePara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// definicion de un cliclo bucle, que incluya 100 ciclos
		
		for(int num=1;num<=100;num++) {
			//comprobando si el numero es divisible por 2 o por 3
			if(num%2==0 || num%3==0) {
				System.out.println(num);
			}
		}
	}
}