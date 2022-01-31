import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Hobbies extends JFrame {

	private JPanel contentPane;
	private JCheckBox chckbxCocina;
	private JCheckBox chckbxJuegos;
	private JCheckBox chckbxTecnología;
	private JCheckBox chckbxDeportes;
	private JLabel lblNewLabel;
	private JTextPane textPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hobbies frame = new Hobbies();
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
	public Hobbies() {
		setTitle("Habilitar/Deshabilitar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Hobbies:");
		lblNewLabel.setBounds(12, 12, 42, 14);
		contentPane.add(lblNewLabel);
		
		chckbxDeportes = new JCheckBox("Deportes");
		chckbxDeportes.setBounds(12, 59, 69, 23);
		contentPane.add(chckbxDeportes);
		
		chckbxTecnología = new JCheckBox("Tecnolog\u00EDa");
		chckbxTecnología.setBounds(12, 86, 77, 23);
		contentPane.add(chckbxTecnología);
		
		chckbxJuegos = new JCheckBox("Juegos");
		chckbxJuegos.setBounds(12, 113, 59, 23);
		contentPane.add(chckbxJuegos);
		
		chckbxCocina = new JCheckBox("Cocina");
		chckbxCocina.setBounds(12, 140, 57, 23);
		contentPane.add(chckbxCocina);
		
		JLabel lblNewLabel_1 = new JLabel("Has seleccionado: ");
		lblNewLabel_1.setBounds(145, 12, 105, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnComprobar = new JButton("Comprobar");
		btnComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(chckbxDeportes.isSelected())
					textPane.setText("Deportes\n");
				
				
				if(chckbxTecnología.isSelected())
					textPane.setText(textPane.getText()+"Tecnología\n");
				
				
				if(chckbxJuegos.isSelected())
					textPane.setText(textPane.getText()+"Juegos\n");
				
				if(chckbxCocina.isSelected())
					textPane.setText(textPane.getText()+"Cocina\n");
				
				
				
			}
		});
		btnComprobar.setBounds(145, 209, 89, 23);
		contentPane.add(btnComprobar);
		
		textPane = new JTextPane();
		textPane.setBounds(206, 62, 203, 105);
		contentPane.add(textPane);
	}
}
