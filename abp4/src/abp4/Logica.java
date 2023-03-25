package abp4;

public class Logica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Boolean V1, V2, V3;
	
	V1 = (('A' > 'B') || ("Hola mundo").length() == 10);
	System.out.println("V1 es " + V1 );
	
	V2 = !((5 + 2) < 7) && ! ((7 > 9) || (3 < 5) && (4 == 3));
	System.out.println("V2 es " + V2);
	
	V3 = (( 2 * 3 + 5 - 7 ) > (2 *(2 + 5)) || (10 - 5) < 20 );
	System.out.println("V3 es " + V3);
	}

}
