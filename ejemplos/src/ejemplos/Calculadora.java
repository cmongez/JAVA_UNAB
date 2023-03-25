package ejemplos;

//Este es un código para un programa de calculadora simple en Java que usa componentes Swing GUI. 
//Crea una ventana que contiene un campo de texto para mostrar la entrada y la salida, y varios botones para ingresar números y 
//realizar operaciones.

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
//import javax.swing.JCheckBox;
//import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Font;

//El programa define una clase llamada "Calculadora" que amplía la clase JFrame. Define varias variables privadas para la memoria de 
//la calculadora y un panel de contenido para contener los componentes de la GUI. 
//El método main() crea una instancia de la clase "Calculadora" y la hace visible.
public class Calculadora extends JFrame {
	// Ejemplo; 2+3=5
	String memoria1;
	String signo;
	String memoria2;

	private JPanel contentPane;
	private JTextField txtPantalla;
	private AbstractButton textFieldResult;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Todos los eventos en cada proceso se debe recargar la GUI
		// O sea, se recarga la interfaz
		// Para evitar la no recarga de la GUI
		// Se realiza el siguiente codigo en donde el Runnable() es el evento.
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					// ubica en donde pudo ocurrir el error
					e.printStackTrace();
				}
			}
		});
	}

	private void sumar() {
		if (!txtPantalla.getText().equals("")) {
			memoria1 = txtPantalla.getText();
			signo = "+";
			txtPantalla.setText("");
		}

	}

	private void multiplicar() {
		if (!txtPantalla.getText().equals("")) {
			memoria1 = txtPantalla.getText();
			signo = "x";
			txtPantalla.setText("");
		}

	}

	private void restar() {
		if (!txtPantalla.getText().equals("")) {
			memoria1 = txtPantalla.getText();
			signo = "-";
			txtPantalla.setText("");
		}
	}

	private void dividir() {
		if (!txtPantalla.getText().equals("")) {
			memoria1 = txtPantalla.getText();
			signo = "/";
			txtPantalla.setText("");
		}

	}

	private void igual() {
		if (!txtPantalla.getText().equals("")) {
			memoria1 = txtPantalla.getText();
			signo = "=";
			int memoria20 = Integer.parseInt(memoria1);
			txtPantalla.setText(Integer.toString(memoria20));
		}

	}

	public Calculadora() {
//El constructor de la clase "Calculadora" establece el título de la ventana, la operación de cierre predeterminada y el tamaño. 
//Crea un campo de texto para mostrar la entrada y la salida, un botón para borrar el campo de texto y varios botones para ingresar 
//números y realizar operaciones. También establece el diseño del panel de contenido en nulo y le agrega los componentes de la GUI.
		// Titulo de la Pestaña
		setTitle("Calculadora original de César");
		// Operacion por defecto al cerrar la ventana
		setDefaultCloseOperation(Calculadora.EXIT_ON_CLOSE);
		// Dimensiona la ventana
		setBounds(100, 100, 430, 461);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		txtPantalla = new JTextField();
		txtPantalla.setText("0");
		txtPantalla.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtPantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		// setBounds indica(X,Y,ancho,alto)
		txtPantalla.setBounds(51, 38, 320, 56);
		contentPane.add(txtPantalla);
		txtPantalla.setColumns(10);

//Cada botón se define usando la clase JButton y se agrega un ActionListener a cada botón usando una expresión lambda. 
//El ActionListener define lo que sucede cuando se hace clic en el botón. En este caso, cada botón agrega su valor al campo de texto.										
		// creamos el boton limpiar pantalla
		JButton btnLimpiar = new JButton("C");
		btnLimpiar.addActionListener(new ActionListener() {

			// creamos el metodo para limpiar pantalla
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText("");
			}
		});
		// setBounds indica(x,y,ancho,alto)
		btnLimpiar.setBounds(51, 104, 122, 39);
		contentPane.add(btnLimpiar);

		// Creamos el boton 7 en pantalla
		JButton btnSiete = new JButton("7");
		btnSiete.addActionListener(new ActionListener() {
			// creamos el metodo para limpiar la pantalla
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText() + 7);
			}
		});
		// setBounds indica (x,y,ancho, alto)
		btnSiete.setBounds(51, 153, 56, 39);
		contentPane.add(btnSiete);

		// creamos el boton ocho en la pantalla
		JButton btnOcho = new JButton("8");
		btnOcho.addActionListener(new ActionListener() {
			// creamos el metodo para limpiar pantalla
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText() + 8);
			}
		});
		// SetBounds indica (x,y,ancho, alto)
		btnOcho.setBounds(117, 153, 56, 39);
		contentPane.add(btnOcho);

		// creamos el boton cuatro en la pantalla
		JButton btnCuatro = new JButton("4");
		btnCuatro.addActionListener(new ActionListener() {
			// creamos el metodo para limpiar pantalla
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText() + 4);
			}
		});
		// SetBounds indica (x,y,ancho, alto)
		btnCuatro.setBounds(51, 202, 56, 39);
		contentPane.add(btnCuatro);

		// creamos el boton cinco en la pantalla
		JButton btnCinco = new JButton("5");
		btnCinco.addActionListener(new ActionListener() {
			// creamos el metodo para limpiar pantalla
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText() + 5);
			}
		});
		// SetBounds indica (x,y,ancho, alto)
		btnCinco.setBounds(117, 202, 56, 39);
		contentPane.add(btnCinco);

		// creamos el boton seis en la pantalla
		JButton btnseis = new JButton("6");
		btnseis.addActionListener(new ActionListener() {
			// creamos el metodo para limpiar pantalla
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText() + 6);
			}
		});
		// SetBounds indica (x,y,ancho, alto)
		btnseis.setBounds(183, 202, 56, 39);
		contentPane.add(btnseis);

		// creamos el boton nueve en la pantalla
		JButton btnnueve = new JButton("9");
		btnnueve.addActionListener(new ActionListener() {
			// creamos el metodo para limpiar pantalla
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText() + 9);
			}
		});
		// SetBounds indica (x,y,ancho, alto)
		btnnueve.setBounds(183, 153, 56, 39);
		contentPane.add(btnnueve);

		// creamos el boton uno en la pantalla
		JButton btnuno = new JButton("1");
		btnuno.addActionListener(new ActionListener() {
			// creamos el metodo para limpiar pantalla
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText() + 1);
			}
		});
		// SetBounds indica (x,y,ancho, alto)
		btnuno.setBounds(51, 251, 56, 39);
		contentPane.add(btnuno);

		// creamos el boton dos en la pantalla
		JButton btndos = new JButton("2");
		btndos.addActionListener(new ActionListener() {
			// creamos el metodo para limpiar pantalla
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText() + 2);
			}
		});
		// SetBounds indica (x,y,ancho, alto)
		btndos.setBounds(117, 251, 56, 39);
		contentPane.add(btndos);

		// creamos el boton tres en la pantalla
		JButton btntres = new JButton("3");
		btntres.addActionListener(new ActionListener() {
			// creamos el metodo para limpiar pantalla
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText() + 3);
			}
		});
		// SetBounds indica (x,y,ancho, alto)
		btntres.setBounds(183, 251, 56, 39);
		contentPane.add(btntres);

		// creamos el boton resta en la pantalla
		JButton btnresta = new JButton("-");
		btnresta.addActionListener(new ActionListener() {
			// creamos el metodo para limpiar pantalla
			public void actionPerformed(ActionEvent e) {
				restar();
			}
		});
		// SetBounds indica (x,y,ancho, alto)
		btnresta.setBounds(183, 104, 56, 39);
		contentPane.add(btnresta);

		// creamos el boton cero en la pantalla
		JButton btncero = new JButton("0");
		btncero.addActionListener(new ActionListener() {
			// creamos el metodo para limpiar pantalla
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText() + 0);
			}
		});
		// SetBounds indica (x,y,ancho, alto)
		btncero.setBounds(51, 300, 188, 39);
		contentPane.add(btncero);
		
		// creamos el boton ce en la pantalla
				JButton btnce = new JButton("CE");
				btnce.addActionListener(new ActionListener() {
					// creamos el metodo para limpiar pantalla
					public void actionPerformed(ActionEvent e) {
						String cadena;
						cadena = txtPantalla.getText();
						
						if(cadena.length()>0) {
							cadena = cadena.substring(0, cadena.length()-1);
							txtPantalla.setText(cadena);
						}
						 
					}
				});
				// SetBounds indica (x,y,ancho, alto)
				btnce.setBounds(51, 350, 120, 39);
				contentPane.add(btnce);

		// creamos el boton igual en la pantalla
		JButton btnigual = new JButton("=");
		btnigual.addActionListener(new ActionListener() {
			// creamos el metodo para limpiar pantalla
			public void actionPerformed(ActionEvent e) {
				String resultado;
				memoria2 = txtPantalla.getText();
				if (!memoria2.equals("")) {
					resultado = calculadora(memoria1, memoria2, signo);
					txtPantalla.setText(resultado);
				}
			}

//				igual();
			public static String calculadora(String memoria1, String memoria2, String signo) {
				Double resultado = 0.0;
				String respuesta;
				if (signo.equals("-")) {
					resultado = Double.parseDouble(memoria1) - Double.parseDouble(memoria2);
				}
				if (signo.equals("+")) {
					resultado = Double.parseDouble(memoria1) + Double.parseDouble(memoria2);
				}
				if (signo.equals("x")) {
					resultado = Double.parseDouble(memoria1) * Double.parseDouble(memoria2);
				}
				if (signo.equals("/")) {
					resultado = Double.parseDouble(memoria1) / Double.parseDouble(memoria2);
				}
				respuesta=resultado.toString();
				return respuesta;
			}

		}

		);
		// SetBounds indica (x,y,ancho, alto)
		btnigual.setBounds(246, 251, 120, 88);
		contentPane.add(btnigual);

		// creamos el boton division en la pantalla
		JButton btndividir = new JButton("/");
		btndividir.addActionListener(new ActionListener() {
			// creamos el metodo para limpiar pantalla
			public void actionPerformed(ActionEvent e) {
				dividir();
			}
		});
		// SetBounds indica (x,y,ancho, alto)
		btndividir.setBounds(246, 104, 56, 39);
		contentPane.add(btndividir);

		// creamos el boton suma en la pantalla
		JButton btnsuma = new JButton("+");
		btnsuma.addActionListener(new ActionListener() {

			// creamos el metodo
			public void actionPerformed(ActionEvent e) {
				sumar();
			}
		});
		// SetBounds indica (x,y,ancho, alto)
		btnsuma.setBounds(309, 104, 56, 138);
		contentPane.add(btnsuma);

		// creamos el boton multiplica en la pantalla
		JButton btnmultiplicar = new JButton("x");
		btnmultiplicar.addActionListener(new ActionListener() {

			// creamos el metodo
			public void actionPerformed(ActionEvent e) {
				multiplicar();
			}
		});
		// SetBounds indica (x,y,ancho, alto)
		btnmultiplicar.setBounds(246, 153, 56, 88);
		contentPane.add(btnmultiplicar);
	}
}