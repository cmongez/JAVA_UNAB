package cuadroLista;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cuadroLista1 extends JFrame {

	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cuadroLista1 frame = new cuadroLista1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public cuadroLista1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList lstNombres = new JList();
		lstNombres.setBounds(55, 20, 202, 80);
		contentPane.add(lstNombres);
		
		JButton btnAceptar1 = new JButton("Aceptar 1");
		btnAceptar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel modelo = new DefaultListModel();
				modelo.addElement("Juan");
				modelo.addElement("María");
				modelo.addElement("Luis");
				lstNombres.setModel(modelo); 
			}
		});
		btnAceptar1.setBounds(48, 188, 136, 37);
		contentPane.add(btnAceptar1);
		
		JButton btnAceptar2 = new JButton("Aceptar 2");
		btnAceptar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel modelo = new DefaultListModel();
				modelo.addElement("Ana");
				modelo.addElement("Marta");
				modelo.addElement("Jose");
				lstNombres.setModel(modelo);
			}
		});
		btnAceptar2.setBounds(201, 188, 127, 37);
		contentPane.add(btnAceptar2);
	}

}