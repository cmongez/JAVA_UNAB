package abp3;

import java.util.Scanner;

public class Accidente {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¿El trabajador conoce los procedimientos?");
		String respuestaProcedimiento = sc.next();
		Boolean conoceProcedimiento = null;

		System.out.println("¿El trabajador conoce el manual de seguridad?Si");
		String respuestaManual = sc.next();
		Boolean conoceManual = null;
		Boolean ucurriraAccidente = null;

		// Se utilizó un Boleean
		if (respuestaProcedimiento.toUpperCase().equals("SI")) {
			conoceProcedimiento = true;
		} else {
			conoceProcedimiento = false;
		}

		if (respuestaManual.toUpperCase().equals("SI")) {
			conoceManual = true;
		} else {
			conoceManual = false;
		}

		if (conoceProcedimiento == true && conoceManual == true) {
			System.out.println("No ocurriran accidentes");
			ucurriraAccidente = false;
		} else {
			System.out.println("Existe la posibilidad que el trabajador se accidente.");
			ucurriraAccidente = true;
		}
		if (ucurriraAccidente == true) {
			System.out.println("El trabajador no conoce los procedimientos y/o el manual de seguridad.");
		} else {
			System.out.println("El trabajador esta en conocimiento y respeta los procedimientos y manuales.");
		}

	}

}
