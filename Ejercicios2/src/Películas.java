import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Películas extends JFrame {

	private JPanel contentPane;
	private JTextField textNombrePelícula;
	private JComboBox combolista;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Películas frame = new Películas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Películas() {
		setBackground(new Color(255, 204, 51));
		setForeground(new Color(255, 204, 0));
		setTitle("Pel\u00EDculas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][10.00][145.00][33.00][grow][]", "[][][][shrink 56][][]"));
		
		JLabel lbltítulo = new JLabel("Escribe el t\u00EDtulo de una pel\u00EDcula");
		contentPane.add(lbltítulo, "cell 2 1");
		
		JLabel lblpelículas = new JLabel("Pel\u00EDculas");
		contentPane.add(lblpelículas, "cell 4 1,alignx center");
		
		textNombrePelícula = new JTextField();
		contentPane.add(textNombrePelícula, "cell 2 3,growx");
		textNombrePelícula.setColumns(10);
		
		combolista = new JComboBox();
		contentPane.add(combolista, "cell 4 3,growx");
		
		JButton btnAñadir = new JButton("A\u00F1adir");
		btnAñadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				String nombre= textNombrePelícula.getText();
				
				if (nombre==null || nombre.equals("")) {
					JOptionPane.showMessageDialog(null,"Debe escribir el título de la película");
				}
				
				else	combolista.addItem(nombre);
			
				
			}
			
		});
					
		
		contentPane.add(btnAñadir, "cell 2 5,alignx center,aligny center");
	}
}
		

