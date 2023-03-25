package Botones2;
import javax.swing.*;
import java.awt.*;


class panel extends JFrame{
	Container contenedor=null;
	
	public panel() {
		setSize(350,150);
		contenedor = this.getContentPane();
		//filas=3, columnas=2, gap=5 horizontal, gap= 5 vertical
//		GridLayout grid=new GridLayout(1,1);
		GridLayout grid=new GridLayout(3,2,5,5);
		contenedor.setLayout(grid);
//		contenedor.add(new JButton("boton"));
		for(int i=0;i<6;i++) {
			contenedor.add(new JButton("Boton"+(i+1)));
		}
		
	}
}


public class Botones2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		panel t=new panel();
		t.show();
	}

}
//Primero filas ---------------
//segundo columnas ||||||||||||||||