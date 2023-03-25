package cuadroLista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;
//import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class CuadroVerificar extends JFrame{
	private JPanel contentPane;
	private JTextField txtResultado;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CuadroVerificar frame = new CuadroVerificar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public CuadroVerificar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox chkPerro = new JCheckBox("Perro");
		chkPerro.setBounds(61, 61, 155, 21);
		contentPane.add(chkPerro);
		
		JCheckBox chkGato = new JCheckBox("Gato");
		chkGato.setBounds(61, 102, 142, 21);
		contentPane.add(chkGato);
		
		JCheckBox chkConejo = new JCheckBox("Conejo");
		chkConejo.setBounds(61, 139, 155, 21);
		contentPane.add(chkConejo);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje="Animales elegidos: ";
				 if (chkPerro.isSelected()) {
				 mensaje=mensaje+"Perro ";
				 } 
				 
				 if (chkGato.isSelected()) {
				 mensaje=mensaje+"Gato ";
				 }
				 
				 if (chkConejo.isSelected()) {
				 mensaje=mensaje+"Conejo ";
				 }
				 
				 txtResultado.setText(mensaje);

			}
		});
		btnAceptar.setBounds(76, 184, 85, 21);
		contentPane.add(btnAceptar);
		
		txtResultado = new JTextField();
		txtResultado.setBounds(61, 215, 297, 38);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Elija los animales que tiene en su casa");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(44, 10, 285, 38);
		contentPane.add(lblNewLabel);
	}

}