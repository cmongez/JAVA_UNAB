package poo;
//El package o paquete es el contenedor de las clases
//Una clase posee atributos, metodos y objetos
//Una clase se representa por un sustantivo o entidad
//recordar el diagrama de clases en base de datos
//Ejemplo de clase (class): usuario, persona, materia, categoria, tipodato, proveedor,
//libro, pais, ciudad, cliente,etc
//Los atributos son caracteristicas de la clase. Por ejemplo
//la clase vehiculo tiene
//Atributos
//Color, modelo, marca, cantidad_ruedas, litros_bencina, cantidad_puertas

//String modelo
//String marca;
//String color;
//int cantidad_ruedas;
//int litros_bencina;
//int cantidad_puertas;

//Los metodos son las acciones que realiza la clase
//arrancar, encender, frenar, virar, acelerar
//public void arrancar();
//public void encender();
//public void frenar();
//public void virar();
//public void acelerar();

public class Vehiculo {
	String color;
	String marca;
	int kilometros;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Vehiculo vehiculo1 = new Vehiculo ();
		vehiculo1.color = "Blanco";
		vehiculo1.marca = "Audi";
		vehiculo1.kilometros = 0;
		
		System.out.println("El color de su vehiculo es: " + vehiculo1.color);
		System.out.println("La marca de su vehiculo es: " + vehiculo1.marca);
		System.out.println("Su vehiculo tiene: " + vehiculo1.kilometros + " kilometros.");
		
		Vehiculo vehiculo2 = new Vehiculo ();
		vehiculo2.color = "Rojo";
		vehiculo2.marca = "Ferrari";
		vehiculo2.kilometros = 100;
		
		System.out.println("El color de su vehiculo es: " + vehiculo2.color);
		System.out.println("La marca de su vehiculo es: " + vehiculo2.marca);
		System.out.println("Su vehiculo tiene: " + vehiculo2.kilometros + " kilometros.");

	}

}
