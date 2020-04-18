package Principal;

import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;

public class GestorPedidos {

	private JFrame frmGestorDePedidos;
	private JTextField textField_0;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestorPedidos window = new GestorPedidos();
					window.frmGestorDePedidos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GestorPedidos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGestorDePedidos = new JFrame();
		frmGestorDePedidos.getContentPane().setEnabled(false);
		frmGestorDePedidos.setTitle("Gestor de pedidos");
		frmGestorDePedidos.setResizable(false);
		frmGestorDePedidos.setBounds(100, 100, 629, 405);
		frmGestorDePedidos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGestorDePedidos.getContentPane().setLayout(null);
		
		JLabel lblCifDelProveedor = new JLabel("CIF del proveedor:");
		lblCifDelProveedor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCifDelProveedor.setBounds(10, 10, 130, 14);
		frmGestorDePedidos.getContentPane().add(lblCifDelProveedor);
		
		JLabel lblRaznSocialDel = new JLabel("Raz\u00F3n Social del Proveedor:");
		lblRaznSocialDel.setBounds(281, 10, 192, 14);
		frmGestorDePedidos.getContentPane().add(lblRaznSocialDel);
		
		JLabel lblNmeroDeFactura = new JLabel("N\u00FAmero de Factura:");
		lblNmeroDeFactura.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNmeroDeFactura.setBounds(10, 35, 130, 14);
		frmGestorDePedidos.getContentPane().add(lblNmeroDeFactura);
		
		JLabel lblDescripcinDeLa = new JLabel("Descripci\u00F3n de la Factura:");
		lblDescripcinDeLa.setBounds(281, 160, 192, 14);
		frmGestorDePedidos.getContentPane().add(lblDescripcinDeLa);
		
		JLabel lblBaseImponible = new JLabel("Base Imponible:");
		lblBaseImponible.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBaseImponible.setBounds(10, 60, 130, 14);
		frmGestorDePedidos.getContentPane().add(lblBaseImponible);
		
		JLabel lblIva = new JLabel("IVA:");
		lblIva.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIva.setBounds(10, 85, 130, 14);
		frmGestorDePedidos.getContentPane().add(lblIva);
		
		JLabel lblTotalImporte = new JLabel("Total importe:");
		lblTotalImporte.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalImporte.setBounds(10, 110, 130, 14);
		frmGestorDePedidos.getContentPane().add(lblTotalImporte);
		
		JLabel lblFechaDeFactura = new JLabel("Fecha de factura:");
		lblFechaDeFactura.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaDeFactura.setBounds(10, 135, 130, 14);
		frmGestorDePedidos.getContentPane().add(lblFechaDeFactura);
		
		JLabel lblFechaDeVencimiento = new JLabel("Fecha de Vencimiento:");
		lblFechaDeVencimiento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaDeVencimiento.setBounds(10, 160, 130, 14);
		frmGestorDePedidos.getContentPane().add(lblFechaDeVencimiento);
		
		textField_0 = new JTextField();
		textField_0.setEnabled(false);
		textField_0.setHorizontalAlignment(SwingConstants.CENTER);
		textField_0.setBounds(145, 7, 96, 20);
		frmGestorDePedidos.getContentPane().add(textField_0);
		textField_0.setColumns(10);
		textField_0.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	            if (textField_0.getText().length() >= 10 ) // limit to 10
	                e.consume();
	        }
	    });
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(281, 35, 322, 90);
		frmGestorDePedidos.getContentPane().add(scrollPane);
		
		JTextPane textPane = new JTextPane();
		textPane.setEnabled(false);
		scrollPane.setViewportView(textPane);
		textPane.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	            if (textPane.getText().length() >= 180 ) // limit to 180
	                e.consume();
	        }
	    });
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBounds(145, 32, 96, 20);
		frmGestorDePedidos.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(281, 185, 322, 90);
		frmGestorDePedidos.getContentPane().add(scrollPane_1);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEnabled(false);
		scrollPane_1.setViewportView(textPane_1);
		textPane_1.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	            if (textPane_1.getText().length() >= 180 ) // limit to 180
	                e.consume();
	        }
	    });
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(145, 57, 96, 20);
		frmGestorDePedidos.getContentPane().add(textField_2);
		textField_2.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	            if (textField_2.getText().length() >= 10 ) // limit to 10
	                e.consume();
	        }
	    });
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(145, 82, 46, 20);
		frmGestorDePedidos.getContentPane().add(textField_3);
		textField_3.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	            if (textField_3.getText().length() >= 3 ) // limit to 10
	                e.consume();
	        }
	    });
		
		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		textField_4.setBounds(145, 107, 96, 20);
		frmGestorDePedidos.getContentPane().add(textField_4);
		textField_4.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	            if (textField_4.getText().length() >= 10 ) // limit to 10
	                e.consume();
	        }
	    });
		
		textField_5 = new JTextField();
		textField_5.setEnabled(false);
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setColumns(10);
		textField_5.setBounds(145, 132, 96, 20);
		frmGestorDePedidos.getContentPane().add(textField_5);
		textField_5.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	            if (textField_5.getText().length() >= 10 ) // limit to 10
	                e.consume();
	        }
	    });
		
		textField_6 = new JTextField();
		textField_6.setEnabled(false);
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setColumns(10);
		textField_6.setBounds(145, 157, 96, 20);
		frmGestorDePedidos.getContentPane().add(textField_6);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(25, 207, 115, 23);
		frmGestorDePedidos.getContentPane().add(btnAgregar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(150, 207, 115, 23);
		frmGestorDePedidos.getContentPane().add(btnEliminar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(25, 241, 115, 23);
		frmGestorDePedidos.getContentPane().add(btnActualizar);
		
		JButton btnProveedores = new JButton("Proveedores");
		btnProveedores.setBounds(150, 241, 115, 23);
		frmGestorDePedidos.getContentPane().add(btnProveedores);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAceptar.setVisible(false);
		btnAceptar.setEnabled(false);
		btnAceptar.setBounds(248, 298, 89, 23);
		frmGestorDePedidos.getContentPane().add(btnAceptar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(248, 332, 89, 23);
		frmGestorDePedidos.getContentPane().add(btnSalir);
		
		JButton btnComprobar = new JButton("Comprobar");
		btnComprobar.setVisible(false);
		btnComprobar.setEnabled(false);
		btnComprobar.setBounds(503, 286, 100, 23);
		frmGestorDePedidos.getContentPane().add(btnComprobar);
		textField_6.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	            if (textField_6.getText().length() >= 10 ) // limit to 10
	                e.consume();
	        }
	    });
		textField_1.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	            if (textField_1.getText().length() >= 11 ) // limit to 10
	                e.consume();
	        }
	    });
		
		
		//Acciones
		
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] options = new String[2];
				options[0] = new String("Sí");
				options[1] = new String("No");
				int result=JOptionPane.showOptionDialog(frmGestorDePedidos.getContentPane(),"¿Realmente desea salir?","Confirmar salida", 0, JOptionPane.QUESTION_MESSAGE,null,options,null);
				if(result==0)
			    {
			      System.exit(0);          
			    }
			}
		});
		
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_0.setEnabled(true);
				textField_1.setEnabled(true);
				textField_2.setEnabled(true);
				textField_3.setEnabled(true);
				textField_4.setEnabled(true);
				textField_5.setEnabled(true);
				textField_6.setEnabled(true);
				textPane.setEnabled(true);
				textPane_1.setEnabled(true);
				btnAceptar.setVisible(true);
				btnAceptar.setEnabled(true);
				btnAgregar.setEnabled(false);
				btnEliminar.setEnabled(false);
				btnActualizar.setEnabled(false);
				//btnProveedores.setEnabled(false);
			}
		});
		
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_0.setEnabled(true);
				btnAceptar.setVisible(true);
				btnAceptar.setEnabled(true);
				btnAgregar.setEnabled(false);
				btnEliminar.setEnabled(false);
				btnActualizar.setEnabled(false);
				//btnProveedores.setEnabled(false);
			}
		});
		
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_0.setEnabled(true);
				btnComprobar.setVisible(true);
				btnComprobar.setEnabled(true);
				btnEliminar.setEnabled(false);
				btnAgregar.setEnabled(false);
				btnActualizar.setEnabled(false);
				//btnProveedores.setEnabled(false);
			}
		});
		
		btnComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setEnabled(true);
				textField_2.setEnabled(true);
				textField_3.setEnabled(true);
				textField_4.setEnabled(true);
				textField_5.setEnabled(true);
				textField_6.setEnabled(true);
				textPane.setEnabled(true);
				textPane_1.setEnabled(true);
				btnComprobar.setVisible(false);
				btnComprobar.setEnabled(false);
				btnAceptar.setVisible(true);
				btnAceptar.setEnabled(true);
			}
		});
		
		btnProveedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frmGestorDePedidos,"Second Window (in development)");
			}
		});
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frmGestorDePedidos,"Base de datos modificada");
				btnAgregar.setEnabled(true);
				btnEliminar.setEnabled(true);
				btnActualizar.setEnabled(true);
				btnProveedores.setEnabled(true);
				btnAceptar.setVisible(false);
				btnAceptar.setEnabled(false);
				textField_0.setEnabled(false);
				textField_1.setEnabled(false);
				textField_2.setEnabled(false);
				textField_3.setEnabled(false);
				textField_4.setEnabled(false);
				textField_5.setEnabled(false);
				textField_6.setEnabled(false);
				textPane.setEnabled(false);
				textPane_1.setEnabled(false);
				textField_0.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textPane.setText(null);
				textPane_1.setText(null);
			}
		});

	}
}
