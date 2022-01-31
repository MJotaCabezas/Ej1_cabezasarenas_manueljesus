import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Habilitar_Deshabilitar extends JFrame {

	private JPanel contentPane;
	private final JButton btnDeshabilita = new JButton("Deshabilita Central");
	private final JButton btnCentral = new JButton("Central");
	private final JButton btnHabilita = new JButton("Habilita Central");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Habilitar_Deshabilitar frame = new Habilitar_Deshabilitar();
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
	
	
	public Habilitar_Deshabilitar() {
		setTitle("Habilitar/Deshabilitar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 128);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][][][]", "[][][][][][][]"));
		btnDeshabilita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnDeshabilita.setEnabled(false);
				btnCentral.setEnabled(false);
				btnHabilita.setEnabled(true);
				
			}
		});
		btnDeshabilita.setMinimumSize(new Dimension(123, 42));
		btnDeshabilita.setSize(new Dimension(0, 10));
		contentPane.add(btnDeshabilita, "cell 1 3");
		btnCentral.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCentral.setMinimumSize(new Dimension(90, 42));
		contentPane.add(btnCentral, "cell 4 3");
		btnHabilita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnDeshabilita.setEnabled(true);
				btnCentral.setEnabled(true);
				btnHabilita.setEnabled(false);
			}
		});
		btnHabilita.setEnabled(false);
		btnHabilita.setMinimumSize(new Dimension(120, 42));
		contentPane.add(btnHabilita, "cell 7 3");
	}

}
