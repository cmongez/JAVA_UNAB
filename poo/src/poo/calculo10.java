package poo;
import javax.swing.JOptionPane;
//el public es el modificador de acceso
//publico: todo lo que se declare se puede utilizar en todo el proyecto
//privado: todo lo que se declare solo se puede utilizar dentro de la clase


public class calculo10 {
//Atributos
	int numero1;
	int numero2;
	int suma;
	int resta;
	int multiplicacion;
	int division;	
	

public void leer() {
	numero1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
	numero2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));

}

public void sumar() {
	suma = numero1 + numero2;
}

public void restar() {
	resta=numero1 - numero2;
}
public void multiplicar() {
	multiplicacion=numero1 * numero2;
}
public void dividir () {
	division = numero1 / numero2;
}


public void mostrarResultado() {
	System.out.println("La suma es: " + suma);
	System.out.println("La resta es: " + resta);
	System.out.println("La multiplicacion es: " + multiplicacion);
	System.out.println("La division es: " + division);
}

}
