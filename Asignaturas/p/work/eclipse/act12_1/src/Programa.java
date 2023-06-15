import java.sql.*;

import com.mysql.cj.xdevapi.Statement;

public class Programa {

	public static void main(String[] args) {
		String urlBaseDeDatoString = "jdbc:mysql://localhost:3306/provaJava";
		
		String usuari = "root";
		String password = "";
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			
			Connection con = DriverManager.getConnection(urlBaseDeDatoString, usuari, password);
			java.sql.Statement statement = con.createStatement();
			ResultSet rSet = statement.executeQuery("SELECT * FROM peliculas");
			
			while (rSet.next()) {
				System.out.println(rSet.getString("codi") + " " + rSet.getString("títol"));
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
