import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Colores extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup Colores = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Colores frame = new Colores();
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
	public Colores() {
		setTitle("Habilitar/Deshabilitar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Selecciona un color");
		lblNewLabel.setBounds(12, 41, 176, 22);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(209, 79, 215, 171);
		contentPane.add(panel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Azul");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.blue);
			}
		});
		rdbtnNewRadioButton.setSelected(true);
		Colores.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(6, 89, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Rojo");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.red);
			}
		});
		rdbtnNewRadioButton_1.setSelected(true);
		Colores.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(6, 128, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Verde");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.green);
			}
		});
		rdbtnNewRadioButton_2.setSelected(true);
		Colores.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(6, 168, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Magenta");
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.magenta);
			}
		});
		rdbtnNewRadioButton_3.setSelected(true);
		Colores.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setBounds(6, 205, 109, 23);
		contentPane.add(rdbtnNewRadioButton_3);
	}
}
