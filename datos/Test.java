package datos;

import java.sql.Connection;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) {
		
		try {
			Connection testCon = ConexionBBDD.crearConexion();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
