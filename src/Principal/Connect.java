package Principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

	/*Por ahora en local, pero cuando pueda usaré 
	https://www.freemysqlhosting.net/ o https://www.freesqldatabase.com/*/
	private static String url = "jdbc:mysql://localhost:3306/empresa";
	private static String user = "root";
	private static String pass = "";
	
	public static Connection conecta() throws SQLException {
		Connection conexion;
		conexion = DriverManager.getConnection(url,user,pass);
		return conexion;
	}

}
