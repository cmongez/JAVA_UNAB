package clase;

public class Primo 
{
	private static Boolean verificaPrimo(int num) {
		
		boolean resultado = false;
		int cantidadDivisores = 0;
		
		for (int contador = 1; contador <= num; contador++) {
		
			if(num % contador == 0) {
				
				cantidadDivisores = cantidadDivisores+1;
			}
		}
		
		if(cantidadDivisores <= 2) {
			
			
			resultado = true;
		}else {
			
		resultado = false;
	}
		
		return resultado;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

int num = 30;
for(int n = 1; n <= num; n++ ) {
	if(verificaPrimo(n)) {
		System.out.println(n);
	}
}
		
	}
}


