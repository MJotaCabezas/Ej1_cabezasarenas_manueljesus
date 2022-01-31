import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class ConversiónMonedas extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCantidad;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JRadioButton rdbtnDólares;
	private JRadioButton rdbtnEuros;
	private JRadioButton rdbtnYenes;
	private JRadioButton rdbtnDólares2;
	private JRadioButton rdbtnEuros2;
	private JRadioButton rdbtnYenes2;
	private JButton btnCalcular;
	private JLabel lblResultado;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversiónMonedas frame = new ConversiónMonedas();
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
	public ConversiónMonedas() {
		setTitle("Habilitar/Deshabilitar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 401, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][:60:60,grow][][][][][:25px:25px][][][][][]", "[:80px:80px][][][][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Conversi\u00F3n a monedas");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel, "cell 0 0 7 1,alignx center");
		
		JLabel lblNewLabel_1 = new JLabel("De:");
		contentPane.add(lblNewLabel_1, "cell 0 2,alignx center");
		
		rdbtnDólares = new JRadioButton("D\u00F3lares");
		rdbtnDólares.setSelected(true);
		buttonGroup.add(rdbtnDólares);
		contentPane.add(rdbtnDólares, "cell 1 2");
		
		rdbtnEuros = new JRadioButton("Euros");
		buttonGroup.add(rdbtnEuros);
		contentPane.add(rdbtnEuros, "cell 2 2");
		
		rdbtnYenes = new JRadioButton("Yenes");
		buttonGroup.add(rdbtnYenes);
		contentPane.add(rdbtnYenes, "cell 3 2");
		
		JLabel lblNewLabel_2 = new JLabel("Cantidad");
		contentPane.add(lblNewLabel_2, "cell 0 3,alignx trailing");
		
		textFieldCantidad = new JTextField();
		contentPane.add(textFieldCantidad, "cell 1 3 3 1,growx");
		textFieldCantidad.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				double cantidad=Double.parseDouble(textFieldCantidad.getText());
				double res = 0;
				if(rdbtnDólares.isSelected()) {
					if (rdbtnDólares2.isSelected())
						JOptionPane.showMessageDialog(null,"El cambio no puede ser de dos monedas iguales. Selecciona otra opción");
					else if (rdbtnEuros2.isSelected()) 
						res=cantidad*0.8989;
					else if (rdbtnYenes2.isSelected()) 	
						res=cantidad*115.6600;
					
					}
				
				if (rdbtnEuros.isSelected()) {
					
					if (rdbtnEuros2.isSelected())
						JOptionPane.showMessageDialog(null,"El cambio no puede ser de dos monedas iguales. Selecciona otra opción");
					else if (rdbtnDólares2.isSelected()) 
						res=cantidad*1.1131;
					else if (rdbtnYenes2.isSelected()) 	
						res=cantidad*128.7500;
				}
				
				if (rdbtnYenes.isSelected()) {
					
					if (rdbtnYenes2.isSelected())
						JOptionPane.showMessageDialog(null,"El cambio no puede ser de dos monedas iguales. Selecciona otra opción");
					else if (rdbtnDólares2.isSelected()) 
						res=cantidad*0.08645;
					else if (rdbtnEuros2.isSelected()) 	
						res=cantidad*0.00777;
				}
						
				lblResultado.setText(String.format( "%.2f" ,res));
				
				}
				
				
		
		});
		
			
			
	
		contentPane.add(btnCalcular, "cell 0 5 6 1,alignx center");
		
		JLabel lblNewLabel_3 = new JLabel("A:");
		contentPane.add(lblNewLabel_3, "cell 0 7,alignx center");
		
		rdbtnDólares2 = new JRadioButton("D\u00F3lares");
		buttonGroup_1.add(rdbtnDólares2);
		contentPane.add(rdbtnDólares2, "cell 1 7");
		
		rdbtnEuros2 = new JRadioButton("Euros");
		rdbtnEuros2.setSelected(true);
		buttonGroup_1.add(rdbtnEuros2);
		contentPane.add(rdbtnEuros2, "cell 2 7");
		
		rdbtnYenes2 = new JRadioButton("Yenes");
		buttonGroup_1.add(rdbtnYenes2);
		contentPane.add(rdbtnYenes2, "cell 3 7");
		
		JLabel lblResu = new JLabel("Resultado");
		contentPane.add(lblResu, "cell 1 10");
		
		lblResultado = new JLabel("");
		contentPane.add(lblResultado, "cell 2 10 2 1");
	}

}
