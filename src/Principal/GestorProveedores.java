package Principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;

public class GestorProveedores {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestorProveedores window = new GestorProveedores();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GestorProveedores() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("CIF del proveedor:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(10, 11, 135, 14);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBounds(155, 8, 96, 20);
		frame.getContentPane().add(textField);
		
		JLabel label_1 = new JLabel("Raz\u00F3n Social del Proveedor:");
		label_1.setBounds(10, 36, 192, 14);
		frame.getContentPane().add(label_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 61, 320, 88);
		frame.getContentPane().add(scrollPane);
		
		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
	}
}
