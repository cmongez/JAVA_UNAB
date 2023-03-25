package abp1;

import javax.swing.JOptionPane;

public class Formulario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isValid = false;
		String RUT, nombres, apellidos, telefono, AFP, sistemaDeSalud, direccion, comuna, edad;
		RUT = nombres = apellidos = telefono = AFP = sistemaDeSalud = direccion = comuna = edad = null;

		// RUT
		while (!isValid) {
			RUT = JOptionPane.showInputDialog("Ingresa tu RUT:");

			if (Integer.parseInt(RUT) < 99999999) {
				isValid = true;
				break;
			}
			JOptionPane.showMessageDialog(null, "El RUT debe ser menor a 99.999.999. ");
		}
		isValid = false;

		// Nombres
		while (!isValid) {
			nombres = JOptionPane.showInputDialog("Ingresa tus nombres:");

			if (nombres.length() != 0) {
				isValid = true;
				break;
			}
			JOptionPane.showMessageDialog(null, "El nombre no puede estar vacio. ");
		}
		isValid = false;

		// Apellidos
		while (!isValid) {
			apellidos = JOptionPane.showInputDialog("Ingresa tus apellidos:");

			if (apellidos.length() != 0) {
				isValid = true;
				break;
			}
			JOptionPane.showMessageDialog(null, "El apellido no puede estar vacio. ");
		}

		isValid = false;

		// Telefono

		while (!isValid) {
			telefono = JOptionPane.showInputDialog("Ingresa tu numero de telefono:");

			if (telefono.length() <= 15) {
				isValid = true;
				break;
			}
			JOptionPane.showMessageDialog(null, "El telefono no puede tener mas de 15 caracteres. ");
		}

		isValid = false;

		// AFP
		while (!isValid) {
			AFP = JOptionPane.showInputDialog("Ingresa tu AFP:");

			if (AFP.length() != 0) {
				isValid = true;
				break;
			}
			JOptionPane.showMessageDialog(null, "La AFP no puede estar vacia. ");
		}

		isValid = false;

		//
		while (!isValid) {
			sistemaDeSalud = JOptionPane.showInputDialog("Selecciona tu sistema de salud: 1 Fonasa, 2 Isapre");

			if (sistemaDeSalud.equals("1")) {
				sistemaDeSalud = "Fonasa";
				isValid = true;
				break;

			} else if (sistemaDeSalud.equals("2")) {
				sistemaDeSalud = "Isapre";
				isValid = true;
				break;

			} else {
				JOptionPane.showMessageDialog(null, "El sistema de salud solo puede ser 1 o 2. ");

			}

		}

		isValid = false;

		// AFP
		while (!isValid) {
			direccion = JOptionPane.showInputDialog("Ingresa tu direccion:");

			if (direccion.length() <= 50) {
				isValid = true;
				break;
			}
			JOptionPane.showMessageDialog(null, "La direccion no puede tener mas de 50 caracteres. ");
		}

		isValid = false;

		// AFP
		while (!isValid) {
			comuna = JOptionPane.showInputDialog("Ingresa tu comuna:");

			if (comuna.length() != 0) {
				isValid = true;
				break;
			}
			JOptionPane.showMessageDialog(null, "La comuna no puede estar vacia. ");
		}

		isValid = false;

		// AFP
		while (!isValid) {
			edad = JOptionPane.showInputDialog("Ingresa tu edad:");

			if (Integer.parseInt(edad) < 120) {
				isValid = true;
				break;
			}
			JOptionPane.showMessageDialog(null, "La edad no puede ser mayor que 120.");
		}

		System.out.println("Rut:" + RUT + ".\n Nombres: " + nombres + ".\n Apellidos: " + apellidos + ".\n Telefono: "
				+ telefono + ".\n AFP: " + AFP + ".\n Sistema de salud: " + sistemaDeSalud + ".\n Direccion: "
				+ direccion + ".\n Comuna: " + comuna + ".\n Edad:" + edad);

	}

}
