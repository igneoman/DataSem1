package Prueba;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

public class Testeo {

	@Test
	public void TestConectar() throws Exception {
		Connection conexion =  Principal.Connect.conecta();
		System.out.println(conexion.getCatalog());
	}
	
	@Test
	public void TestPedidos(){
		Principal.GestorPedidos.fixdataint("");
		Principal.GestorPedidos.fixdatastr("");
		Principal.GestorPedidos.iniForDataEx();
		Principal.GestorPedidos.newFile("", false);
		Principal.GestorPedidos.main(null);
	}
	

	@Test
	public void TestProveedores(){
		Principal.GestorProveedores.fixdataint("");
		Principal.GestorProveedores.fixdatastr("");
		Principal.GestorProveedores.iniForDataEx();
		Principal.GestorProveedores.newFile("", false);
		//Principal.GestorProveedores.main(null);//Eliminado por depender de Pedidos
	}
	
	@Test
	public void TestMain(){
		Principal.Main.main(null);
	}

}
