package abp1;
import javax.swing.JOptionPane;
public class FormularioCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String RUT = JOptionPane.showInputDialog("Ingresa tu RUT:");
		String nombres = JOptionPane.showInputDialog("Ingresa tus nombres:");
		String apellidos = JOptionPane.showInputDialog("Ingresa tus apellidos:");
		String telefono = JOptionPane.showInputDialog("Ingresa tu numero de telefono:");
		String AFP = JOptionPane.showInputDialog("Ingresa tu AFP:");
		String sistemaDeSalud = JOptionPane.showInputDialog("Selecciona tu sistema de salud: 1 Fonasa, 2 Isapre");
		String direccion = JOptionPane.showInputDialog("Ingresa tu direccion:");
		String comuna = JOptionPane.showInputDialog("Ingresa tu comuna:");
		String edad = JOptionPane.showInputDialog("Ingresa tu edad:");
		
			String error = "";
		
			// Validaciones
			
			if(Integer.parseInt(RUT)>99999999) {
				
				 error = "El RUT debe ser menor a 99.999.999. ";
			}
			if(nombres.length()==0) {
				
				error = error  + "El nombre no puede estar vacio. ";
			}
			if(apellidos.length()==0) {
				
				error = error  + "El apellido no puede estar vacio. ";
			}
			if(telefono.length()>15) {
				
				error = error + "El telefono no puede tener mas de 15 caracteres. ";
			}
			
			if(AFP.length()==0) {
				
				error = error  + "La AFP no puede estar vacia. ";
			}
			if(!sistemaDeSalud.equals("1")  && !sistemaDeSalud.equals("2")) {
				
				error = error + "El sistema de salud solo puede ser 1 o 2. ";
			}else if(sistemaDeSalud.equals("1")) {
				sistemaDeSalud = "Fonasa";
			}else {
				sistemaDeSalud = "Isapre";
			}
			
			if(direccion.length()>50) {
				
				error = error + "La direccion no puede tener mas de 50 caracteres. ";
			}
			
			if(comuna.length()==0) {
				
				error = error + "La direccion no puede tener mas de 50 caracteres. ";
			}
			if(Integer.parseInt(edad)>=120) {
				
				error = error + "La edad no puede ser mayor que 120. ";
			}
			if (error.length()>0) {
				
				System.out.println("Su solicitud presenta los siguientes errores: "+ error);
			}else {
				
				System.out.println("Rut:" + RUT + ". \nNombres: " + nombres + ".  \nApellidos: " + 
			apellidos + ".  \nTelefono: " + telefono + ". \nAFP: " + AFP + ".  \nSistema de salud: " + 
						sistemaDeSalud + ".  \nDireccion: " + direccion + ".  \nComuna: " + comuna + ".  \nEdad:" + edad);
			}
		
	
	}	
	
}

