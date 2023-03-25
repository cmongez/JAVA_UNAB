package cuadroLista;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cuadroLista extends JFrame{
	private JPanel contentPane;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cuadroLista frame = new cuadroLista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public cuadroLista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 212);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel etiResultado = new JLabel("");
		etiResultado.setBounds(193, 46, 193, 26);
		contentPane.add(etiResultado);
		
		JPanel panel = new JPanel();
		panel.setBounds(68, 46, 103, 21);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JComboBox cboColores = new JComboBox();
		cboColores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje="El color elegido es ";
				 
				mensaje=mensaje+cboColores.getSelectedItem().toString();
				etiResultado.setText(mensaje);
			}
		});
		cboColores.setBounds(0, 0, 103, 21);
		panel.add(cboColores);
		cboColores.setModel(new DefaultComboBoxModel(new String[] {"Rojo", "Verde", "Azul"}));
	}
}