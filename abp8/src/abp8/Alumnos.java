package abp8;

import java.util.Scanner;

public class Alumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String nombre = "";
		int calificacion;
		String alumnoMayor ="";
		int calificacionMayor=0;
		String alumnoMenor ="";
		int calificacionMenor=0;
		int acumulador = 0;
		int contador = 0;
		double promedio;
		Boolean ingresandoDatos = true;
		
		System.out.println("Iniciando programa, recuerda escribir nombre de alumno como SALIR si deseas finalizar.");
		while(ingresandoDatos) {
			
			System.out.println("Ingresa el nombre del alumno o SALIR");
			nombre = sc.nextLine();
			
			if(nombre.equals("SALIR") ) {
				break;
			}
			
			System.out.println("Ingresa la calificacion del alumno");
			
			calificacion = sc.nextInt();
			
			if(calificacion > calificacionMayor) {
				calificacionMayor=calificacion;
				alumnoMayor = nombre;
			}else if(calificacion < calificacionMenor || calificacionMenor == 0) {
				calificacionMenor=calificacion;
				alumnoMenor = nombre;
			}
			acumulador+=calificacion;
			sc.nextLine();
			contador++;
		}
		
		
		if(contador>=2) {
			promedio = (double) acumulador/contador;
			System.out.println("El promedio de calificacioens es: " + promedio);

			System.out.println("La calificacion mayor fue del alumno: " + alumnoMayor +calificacionMayor);

			System.out.println("La calificacion menor fue del alumno: " + alumnoMenor + calificacionMenor);
			
		}else {
			System.out.println("No se pueden calcular ya que ingresaste menos de 2 alumnos.");
		}
		
	}

}
