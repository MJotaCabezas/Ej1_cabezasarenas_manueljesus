import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Conversión_Monedas_Lista_Desplegable extends JFrame {
	public void Conversión_Monedas_Lista_Desplegable() {
	}

	private JPanel contentPane;
	private JTextField textFieldCantidad;
	private JButton btnCalcular;
	private JLabel lblResultado;
	private JComboBox comboConversión;
	private JComboBox comboConversión2;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversión_Monedas_Lista_Desplegable frame = new Conversión_Monedas_Lista_Desplegable();
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
	public Conversión_Monedas_Lista_Desplegable() {
		setTitle("78");
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
		contentPane.add(lblNewLabel_1, "cell 0 2,alignx trailing");
		
		comboConversión = new JComboBox();
		comboConversión.setModel(new DefaultComboBoxModel(new String[] {"D\u00F3lares", "Euros", "Yenes"}));
		contentPane.add(comboConversión, "cell 1 2 3 1,growx");
		
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
				if(comboConversión.getSelectedIndex() ==0){
					if (comboConversión2.getSelectedIndex() ==0)
						JOptionPane.showMessageDialog(null,"El cambio no puede ser de dos monedas iguales. Selecciona otra opción");
					else if (comboConversión2.getSelectedIndex() ==1)
						res=cantidad*0.8989;
					else if (comboConversión2.getSelectedIndex() ==2)	
						res=cantidad*115.6600;
					
					}
				
				if(comboConversión.getSelectedIndex() ==1) {
					
					if (comboConversión2.getSelectedIndex() ==1)
						JOptionPane.showMessageDialog(null,"El cambio no puede ser de dos monedas iguales. Selecciona otra opción");
					else if (comboConversión2.getSelectedIndex() ==0)
						res=cantidad*1.1131;
					else if (comboConversión2.getSelectedIndex() ==2)
						res=cantidad*128.7500;
				}
				
				if (comboConversión.getSelectedIndex() ==2) {
					
					if (comboConversión2.getSelectedIndex() ==2)
						JOptionPane.showMessageDialog(null,"El cambio no puede ser de dos monedas iguales. Selecciona otra opción");
					else if (comboConversión2.getSelectedIndex() ==0) 
						res=cantidad*0.08645;
					else if (comboConversión2.getSelectedIndex() ==1)	
						res=cantidad*0.00777;
				}
					
				if (comboConversión2.getSelectedIndex()==0) 
					lblResultado.setText(String.format( "%.2f" ,res)+"$");
				
				else if (comboConversión2.getSelectedIndex()==1) 
					lblResultado.setText(String.format( "%.2f" ,res)+"€");
				
				else if (comboConversión2.getSelectedIndex()==2) 
					lblResultado.setText(String.format( "%.2f" ,res)+"¥");
				
				
				
				}
				
				
		
		});
		
			
			
	
		contentPane.add(btnCalcular, "cell 0 5 6 1,alignx center");
		
		JLabel lblNewLabel_3 = new JLabel("A:");
		contentPane.add(lblNewLabel_3, "cell 0 7,alignx trailing");
		
		comboConversión2 = new JComboBox();
		comboConversión2.setModel(new DefaultComboBoxModel(new String[] {"D\u00F3lares", "Euros", "Yenes"}));
		contentPane.add(comboConversión2, "cell 1 7 2 1,growx");
		
		JLabel lblResu = new JLabel("Resultado");
		contentPane.add(lblResu, "cell 1 10");
		
		lblResultado = new JLabel("");
		contentPane.add(lblResultado, "cell 2 10 2 1");
	}

}
