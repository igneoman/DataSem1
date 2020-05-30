package Principal;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

public class GestorProveedores {

	private static Connection con = null;
	private JFrame fraGestProv;
	private JFrame padre;
	private JTextField textField_0;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	Connection conexion=null;
	PreparedStatement preparedStatement=null;
	ResultSet resultSet=null;
	
	private boolean crear=true;
	

	/**
	 * Launch the application. Deshabilitar después
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestorProveedores window = new GestorProveedores();
					window.fraGestProv.setVisible(true);
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
	
	public void setFrame(JFrame frame) {
		this.fraGestProv = frame;
	}
	
	public GestorProveedores(JFrame padre) {
		initialize();
		this.padre = padre;
	}
	
	public JFrame getFrame() {
		return fraGestProv;
	}
	
	public void getFather(JFrame frmGestorDePedidos) {
		padre=frmGestorDePedidos;
	}
	
	public static void newFile(String entrada, boolean tipo) {
		try {
			
			File myObj=null;
	    
			if (tipo==true) {
				myObj = new File("datosP.json");
			}
	    	else {
	    		myObj = new File("datosP.xml");
	    	}
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
				FileWriter wri = new FileWriter(myObj);
				wri.write(entrada);
				wri.close();
			} 
			else {
	        System.out.println("File already exists.");
			}
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	  }
	
	public static Connection iniForDataEx(){
		try {
			//Local
			//con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empresadb","root","");
			//Remoto
			con=DriverManager.getConnection("jdbc:mysql://db4free.net:3306/empresadb9","tester12309","Testear123");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	//En el caso de "" dará 0 en valores numéricos
	public static int fixdataint(String fixing) {
		if(fixing.equals("")) {
			return 0;
		}
		else
		{
			return Integer.valueOf(fixing);
		}
	}
	
	//En el caso de "" dará null en valores de cadena
	public static String fixdatastr(String fixing) {
		if(fixing.equals("")) {
			return null;
		}
		else
		{
			return fixing;
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		fraGestProv = new JFrame();
		fraGestProv.setResizable(false);
		fraGestProv.setTitle("Gestor proveedores");
		fraGestProv.setBounds(100, 100, 356, 450);
		fraGestProv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fraGestProv.getContentPane().setLayout(null);
		
		JLabel label_0 = new JLabel("CIF del proveedor:");
		label_0.setHorizontalAlignment(SwingConstants.RIGHT);
		label_0.setBounds(10, 60, 170, 14);
		fraGestProv.getContentPane().add(label_0);
		
		JLabel label_2 = new JLabel("Registro notarial:");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(10, 85, 170, 14);
		fraGestProv.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Cod. ressponsabilidad civil:");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(10, 110, 170, 14);
		fraGestProv.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Importe seguro R.C.:");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(10, 135, 170, 14);
		fraGestProv.getContentPane().add(label_4);
		
		JLabel label_1 = new JLabel("Raz\u00F3n Social del Proveedor:");
		label_1.setBounds(10, 186, 192, 14);
		fraGestProv.getContentPane().add(label_1);
		
		JLabel lblFecha = new JLabel("Fecha homologaci\u00F3n:");
		lblFecha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFecha.setBounds(10, 160, 170, 14);
		fraGestProv.getContentPane().add(lblFecha);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 211, 320, 88);
		fraGestProv.getContentPane().add(scrollPane);
		
		JTextPane textPane = new JTextPane();
		textPane.setEnabled(false);
		textPane.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	            if (textPane.getText().length() >= 180 ) // limit to 180
	                e.consume();
	        }
	    });
		scrollPane.setViewportView(textPane);
		
		textField_0 = new JTextField();
		textField_0.setEnabled(false);
		textField_0.setHorizontalAlignment(SwingConstants.CENTER);
		textField_0.setColumns(10);
		textField_0.setBounds(190, 57, 96, 20);
		textField_0.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	            if (textField_0.getText().length() >= 10 ) // limit to 10
	                e.consume();
	        }
	    });
		fraGestProv.getContentPane().add(textField_0);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(190, 82, 96, 20);
		textField_1.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	            if (textField_1.getText().length() >= 10 ) // limit to 10
	                e.consume();
	        }
	    });
		fraGestProv.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(190, 107, 96, 20);
		textField_2.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	            if (textField_2.getText().length() >= 10 ) // limit to 10
	                e.consume();
	        }
	    });
		fraGestProv.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(190, 132, 96, 20);
		textField_3.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	            if (textField_3.getText().length() >= 10 ) // limit to 10
	                e.consume();
	        }
	    });
		fraGestProv.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		textField_4.setBounds(190, 157, 96, 20);
		textField_4.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	            if (textField_4.getText().length() >= 10 ) // limit to 10
	                e.consume();
	        }
	    });
		fraGestProv.getContentPane().add(textField_4);
		
		JButton btnAgregar = new JButton("Agregar");
		
		btnAgregar.setBounds(30, 11, 89, 23);
		fraGestProv.getContentPane().add(btnAgregar);
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(222, 11, 89, 23);
		fraGestProv.getContentPane().add(btnEliminar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(126, 387, 89, 23);
		fraGestProv.getContentPane().add(btnSalir);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setVisible(false);
		btnAceptar.setBounds(126, 353, 89, 23);
		fraGestProv.getContentPane().add(btnAceptar);
		
		
		JButton btnJson = new JButton("JSON");
		btnJson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String json="";
					json+="{"+"\"ACT_PROV\":"+" [\n";
					Statement jsond = iniForDataEx().createStatement();
					//local
					//jsond.execute("use "+"empresadb");
					//remote
					jsond.execute("use "+"empresadb9");
					String jsonr = "Select * FROM " + "prov_comp";
					ResultSet jsonsr = jsond.executeQuery(jsonr);
					ResultSetMetaData coldate = jsonsr.getMetaData();
					
					while (jsonsr.next()) {
						json+="{";
						for(int i = 0; i < coldate.getColumnCount();i++) {
							json+="\""+coldate.getColumnName(i+1)+"\":\""+jsonsr.getObject(i+1)+"\"";
							if(i< coldate.getColumnCount()-1)json+=",";
						}
						json+="},\n";
						
					}
					json+="] }";
					
					//System.out.println(json);
					newFile(json,true);
					
				}
				catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
		});
		btnJson.setBounds(87, 310, 75, 23);
		fraGestProv.getContentPane().add(btnJson);
		
		JButton btnXml = new JButton("XML");
		btnXml.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String xml="";
					xml+="<"+"ACT_PROV"+">\n";
					Statement xmld = iniForDataEx().createStatement();
					//local
					//xmld.execute("use "+"empresadb");
					//remote	
					xmld.execute("use "+"empresadb9");
					String xmlr = "Select * FROM " + "prov_comp";
					ResultSet xmlsr = xmld.executeQuery(xmlr);
					ResultSetMetaData coldate = xmlsr.getMetaData();
					
					while (xmlsr.next()) {
						xml+="\t<"+"proveedor"+">\n";
						for(int i = 0; i < coldate.getColumnCount();i++) {
							xml+="\t\t<"+coldate.getColumnName(i+1)+">"+xmlsr.getObject(i+1)+"</"+coldate.getColumnName(i+1)+">\n";
						}
						xml+="\t<"+"proveedor"+">\n";
						
					}
					xml+="<"+"prov_comp"+">\n";
					
					//System.out.println(xml);
					newFile(xml,false);
					
					
					
				}
				catch (SQLException ex) {
					ex.printStackTrace();
				}
				catch(Exception e1)
				{
				    e1.printStackTrace(); //connection failed
				}
			}
		});
		btnXml.setBounds(172, 310, 77, 23);
		fraGestProv.getContentPane().add(btnXml);
		
		
		//Acciones
		
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_0.setEnabled(true);
				textField_1.setEnabled(true);
				textField_2.setEnabled(true);
				textField_3.setEnabled(true);
				textField_4.setEnabled(true);
				textPane.setEnabled(true);
				btnAceptar.setVisible(true);
				btnAceptar.setEnabled(true);
				btnAgregar.setEnabled(false);
				btnEliminar.setEnabled(false);
				crear=true;
			}
		});
		
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_0.setEnabled(true);
				btnAceptar.setVisible(true);
				btnAceptar.setEnabled(true);
				btnAgregar.setEnabled(false);
				btnEliminar.setEnabled(false);
				crear=false;
			}
		});
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (crear){
					
					if(textField_0.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Datos insuficientes");
					}
					else {
				
						try {
							conexion = Connect.conecta();
							preparedStatement = conexion.prepareStatement("Insert into prov_comp VALUES (?,?,?,?,?,?)");
							preparedStatement.setString(1, fixdatastr(textField_0.getText()));
							preparedStatement.setString(3, fixdatastr(textField_1.getText()));
							preparedStatement.setString(4, fixdatastr(textField_2.getText()));
							preparedStatement.setString(5, fixdatastr(textField_3.getText()));
							preparedStatement.setString(6, fixdatastr(textField_4.getText()));
							preparedStatement.setString(2, fixdatastr(textPane.getText()));
							
							int ok = preparedStatement.executeUpdate();
							if (ok > 0) {
								JOptionPane.showMessageDialog(null, "Dato agregado");
								conexion.close();
							}
							else if(conexion==null) {
								JOptionPane.showMessageDialog(null, "Error agregar, valor nulo");
							}
							else {
								JOptionPane.showMessageDialog(null, "Error agregar");
							}
						} catch(SQLIntegrityConstraintViolationException e0) {
							JOptionPane.showMessageDialog(null, "Valor duplicado");	
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
					}
				
				}
				else {
					try {
						conexion = Connect.conecta();
						//conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresadb", "root", "");
						preparedStatement = conexion.prepareStatement("Delete from prov_comp where CIF_PROVEEDOR=?");
						preparedStatement.setString(1, textField_0.getText());
						//preparedStatement.setString(1, "1111");
						int ok = preparedStatement.executeUpdate();
						if (ok > 0) {
							JOptionPane.showMessageDialog(null, "Dato quitado");
							conexion.close();
						}
						else if(conexion==null) {
							JOptionPane.showMessageDialog(null, "Error eliminar, valor nulo");
						}
						else {
							JOptionPane.showMessageDialog(null, "Error eliminar");
						}
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
				
				btnAceptar.setVisible(false);
				btnAceptar.setEnabled(false);
				textField_0.setEnabled(false);
				textField_1.setEnabled(false);
				textField_2.setEnabled(false);
				textField_3.setEnabled(false);
				textField_4.setEnabled(false);
				textPane.setEnabled(false);
				textField_0.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textPane.setText(null);
				btnAgregar.setEnabled(true);
				btnEliminar.setEnabled(true);
				
			}
		});
		
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				padre.setVisible(true);
				fraGestProv.dispose();
			}
		});
	}
}
