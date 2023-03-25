package abpro4;

import java.util.Scanner;

public class Usuarios {
	static Scanner sc = new Scanner(System.in);
	static String[][] usuarios = new String[100][10];
	static String nombre = "";
	static String fechaNacimiento = "";
	static String RUT = "";
	static int opcionCategoria;
	static String categoria = "";
	static String direccion = "";
	static String telefono = "";
	static int cantidadEmpleados;
	static int aniosExperiencia;
	static String departamento = "";
	static String funcion = "";
	static String nombreSuperior = "";
	static int ultimoIndex = 0;
	static int filaARellenar = 0;

	// REGISTRAR USUARIO
	public static void registrarUsuario() {
		nombre = "";
		while (nombre.isEmpty()) {
			System.out.println("Ingresa el nombre del usuario:");
			nombre = sc.nextLine();

			if (nombre.isEmpty()) {
				System.out.println("El nombre no puede estar vacio.");
			}
		}
		usuarios[filaARellenar][0] = nombre;

		System.out.println("Ingresa la fecha de nacimiento dd/mm/aa:");
		fechaNacimiento = sc.nextLine();

		usuarios[filaARellenar][1] = fechaNacimiento;
		while (RUT.isEmpty()) {
			System.out.println("Ingresa el RUT del usuario. Ejem 11111111-1: ");
			RUT = sc.nextLine();

			if (RUT.isEmpty()) {
				System.out.println("El RUT no puede estar vacio.");
			}
		}
		usuarios[filaARellenar][2] = RUT;

		do {
			System.out.println("Selecciona la categoria del usuario:");
			System.out.println("1. Cliente");
			System.out.println("2. Profesional");
			System.out.println("3. Administrativo");

			opcionCategoria = sc.nextInt();
			sc.nextLine();
			System.out.println(opcionCategoria);
			switch (opcionCategoria) {
			case 1:
				categoria = "Cliente";
				usuarios[filaARellenar][3] = categoria;
				registrarCliente();

				break;
			case 2:
				categoria = "Profesional";
				usuarios[filaARellenar][3] = categoria;
				registrarProfesional();
				break;
			case 3:
				categoria = "Administrativo";
				usuarios[filaARellenar][3] = categoria;
				registrarAdministrativo();
				break;
			default:
				System.out.println("Opción no válida.");
				break;
			}
		} while (opcionCategoria != 1 && opcionCategoria != 2 && opcionCategoria != 3);

	}

	// REGISTRAR USUARIO
	public static void registrarCliente() {
		while (direccion.isEmpty()) {
			System.out.println("Ingresa la dirección del cliente:");
			direccion = sc.nextLine();

			if (direccion.isEmpty()) {
				System.out.println("La dirección no puede estar vacio.");
			}
		}
		usuarios[filaARellenar][4] = direccion;

		while (telefono.isEmpty()) {
			System.out.println("Ingresa el telefono del cliente.");
			telefono = sc.nextLine();

			if (telefono.isEmpty()) {
				System.out.println("El telefono no puede estar vacio.");
			}
		}
		usuarios[filaARellenar][5] = telefono;

		System.out.println("Ingresa la cantidad de empleados:");
		cantidadEmpleados = sc.nextInt();
		sc.nextLine();
		usuarios[filaARellenar][6] = String.valueOf(cantidadEmpleados);
	}

	// REGISTRAR PROFESIONAL
	public static void registrarProfesional() {
		System.out.println("Ingresa los años de experiencia:");
		aniosExperiencia = sc.nextInt();
		sc.nextLine();
		usuarios[filaARellenar][4] = String.valueOf(aniosExperiencia);

		while (departamento.isEmpty()) {
			System.out.println("Ingresa el departameto: ");
			departamento = sc.nextLine();

			if (departamento.isEmpty()) {
				System.out.println("El departamento no puede estar vacio.");
			}
		}
		usuarios[filaARellenar][5] = departamento;

	}

	// REGISTRAR ADMINISTRATIVO
	public static void registrarAdministrativo() {

		while (funcion.isEmpty()) {
			System.out.println("Ingresa la función: ");
			funcion = sc.nextLine();

			if (funcion.isEmpty()) {
				System.out.println("La función no puede estar vacio.");
			}
		}
		usuarios[filaARellenar][4] = funcion;

		System.out.println("Ingresa el nombre del superior:");
		nombreSuperior = sc.nextLine();
		usuarios[filaARellenar][5] = nombreSuperior;

	}

	// IMPRIMIR USUARIOS
	public static void mostrarUsuarios() {
		for (int i = 0; i < ultimoIndex; i++) {
			for (int j = 0; j < usuarios[i].length; j++) {
				if (usuarios[i][j] == null) {
					break;
				}
				System.out.print(usuarios[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void contarUsuariosPorCategoria() {
		int nroClientes = 0;
		int nroProfesionales = 0;
		int nroAdministrativos = 0;
		int ultimaFila = ultimaFilaVacia();
		for (int i = 0; i < ultimaFila; i++) {

			if (usuarios[i][3] == "Cliente") {
				nroClientes++;
			} else if (usuarios[i][3] == "Profesional") {
				nroProfesionales++;
			} else {
				nroAdministrativos++;
			}
		}

		System.out.println("Numero de clientes: " + nroClientes);
		System.out.println("Numero de profesionales: " + nroProfesionales);
		System.out.println("Numero de administrativos: " + nroAdministrativos);
	}

	public static void limpiarVariables() {
		nombre = "";
		fechaNacimiento = "";
		RUT = "";
		opcionCategoria = 0;
		categoria = "";
		direccion = "";
		telefono = "";
		cantidadEmpleados = 0;
		aniosExperiencia = 0;
		departamento = "";
		funcion = "";
		nombreSuperior = "";

	}

	public static int ultimaFilaVacia() {
		int ultimaVacia = -1;
		for (int i = usuarios.length - 1; i >= 0; i--) {
			boolean vacia = true;
			for (int j = 0; j < usuarios[i].length; j++) {
				if (usuarios[i][j] != null) {
					vacia = false;
					break;
				}
			}
			if (!vacia) {
				break;
			}
			ultimaVacia = i;
		}

		return ultimaVacia;

	}

	public static void eliminarUsuario() {

		String RUTaEliminar = "";

		while (RUTaEliminar.isEmpty()) {
			System.out.println("Ingresa el RUT del usuario a eliminar: ");
			RUTaEliminar = sc.nextLine();

			if (RUTaEliminar.isEmpty()) {
				System.out.println("El RUT a eliminar no puede estar vacio.");
			}
		}
		System.out.println(RUTaEliminar + "aca");
		int index = obtenerIndexUsuarioPorRUTyEliminar(RUTaEliminar);

		if (index != -1) {

			System.out.println("El usuario con el RUT: " + RUTaEliminar + " ha sido eliminado.");
		} else {
			System.out.println("El usuario con el RUT: " + RUTaEliminar + " no existe.");
		}
	}

	public static int obtenerIndexUsuarioPorRUTyEliminar(String RUT) {
		int index = -1;
		
		for (int i = 0; i < ultimoIndex; i++) {
		
			if (usuarios[i][2].equals(RUT)) {
				index = i;
				eliminarFila(index);
				break;
			}
		}

		return index;
	}
	
	public static int obtenerIndexUsuarioPorRUTyModificar(String RUT) {
		int index = -1;
		
		for (int i = 0; i < ultimoIndex; i++) {
		
			if (usuarios[i][2].equals(RUT)) {
				index = i;
				filaARellenar = index;
				registrarUsuario();
				break;
			}
		}

		return index;
	}

	public static void eliminarFila(int index) {
	    for (int i = index; i < ultimoIndex - 1; i++) {
	        usuarios[i] = usuarios[i + 1];
	    }

	    usuarios[ultimoIndex - 1] = new String[10];
	    ultimoIndex--;
	}
	
	public static void modificarUsuario() {

		String RUTaModificar = "";

		while (RUTaModificar.isEmpty()) {
			System.out.println("Ingresa el RUT del usuario a modificar: ");
			RUTaModificar = sc.nextLine();

			if (RUTaModificar.isEmpty()) {
				System.out.println("El RUT del usuario a modificar no puede estar vacio.");
			}
		}
		int index = obtenerIndexUsuarioPorRUTyModificar(RUTaModificar);

		if (index != -1) {

			System.out.println("El usuario con el RUT: " + RUTaModificar + " ha sido modificado.");
		} else {
			System.out.println("El usuario con el RUT: " + RUTaModificar + " no existe.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		do {

			System.out.println("Selecciona una de las siguientes opciones y/o 6 para salir.");
			System.out.println("1. Registrar usuario ");
			System.out.println("2. Mostrar usuarios ");
			System.out.println("3. Contar usuarios por categoría ");
			System.out.println("4. Modificar usuarios ");
			System.out.println("5. Eliminar usuario ");
			System.out.println("6. Salir. ");

			opcion = sc.nextInt();
			sc.nextLine();
			switch (opcion) {
			case 1:
				filaARellenar = ultimoIndex;
				registrarUsuario();
				System.out.println("Usuario creado con exito.");
				ultimoIndex++;
				limpiarVariables();
				break;
			case 2:
				mostrarUsuarios();
				break;
			case 3:
				contarUsuariosPorCategoria();
				break;
			case 4:
				//Modificar usuario
				filaARellenar = ultimoIndex;
				modificarUsuario();
				break;
			case 5:
				eliminarUsuario();
				break;
			case 6:
				System.out.println("Saliendo del programa.");
				break;
			default:
				System.out.println("Opción no válida.");
				break;
			}

		} while (opcion != 6);

	}

}
