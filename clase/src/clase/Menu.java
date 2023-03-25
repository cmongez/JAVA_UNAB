package clase;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		int opcion;
		String seguir;
		 
		 do {
			 
			 System.out.println("MENU");
			 System.out.println("1. Internet basico");
			 System.out.println("2. Internet intermedio");
			 System.out.println("3. Internet avanzado");
			 System.out.println("4. Internet para expertos");
			 System.out.println("5. Salir");
			 System.out.println("Elija su opcion (1-5)");
			 
			 Scanner sc = new Scanner(System.in);
			 opcion = sc.nextInt();			 
			 
			 switch(opcion) {
				case 1:
					System.out.println("HTML5. \n CSS3 \n JavaScript\n Jquery\n Imagenes vectoriales");
					break;
				case 2:
					System.out.println("PHP basico \n PHP intermedio \n PHP avanzado ");
					break;
				case 3:
					System.out.println("Diseño grafico \n Diseño UML \n Bases de datos");
					break;
				case 4:
					System.out.println("Programacion orientada a objetos \n Seguridad en bases de datos \n Administracion de proyectos ");
					break;
				case 5:
					System.out.println("Esta a punto de salir del sistema");
					break;
				default:
					System.out.println("Opcion no valida");
			}
			 sc.nextLine();
			 System.out.println("Presione Cualquier tecla para continuar");
			 sc.nextLine();
			 
			 
		 } while(opcion != 5 );
		 
		 
	}

}
