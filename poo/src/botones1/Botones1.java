package botones1;
import java.awt.*;
import javax.swing.*;

class panel extends JFrame{
	public panel () {
		setSize(400,250);
		Container contenedor = this.getContentPane();
		contenedor.setLayout( new BorderLayout(2,2));
		
		String[] ubicacionBoton = {
				BorderLayout.NORTH,
				BorderLayout.SOUTH,
				BorderLayout.EAST,
				BorderLayout.WEST, 
				BorderLayout.CENTER
				
		};
		String[] nombreBoton = {"Boton norte", "Boton sur", "Boton este", "Boton oeste", "Boton central"};
		
		for(int i=0; i<ubicacionBoton.length; i++) {
			JButton boton=new JButton(nombreBoton[i]);
			contenedor.add(boton, ubicacionBoton[i]);
		}
	}
}
public class Botones1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		panel t=new panel();
		t.show();
	}

}
