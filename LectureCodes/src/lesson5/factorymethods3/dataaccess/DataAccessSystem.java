package lesson5.factorymethods3.dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DataAccessSystem implements DataAccess {
	//package level access
	DataAccessSystem() {}
	public void read(Dao dao) throws SQLException {
		String query = dao.getSql();
		Connection con = null;
		try {
			con = ConnectManager.getConnection();	
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			dao.unpackResultSet(rs);
		} catch(SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
			
		} finally {
			if(con != null) {
				try {
				 con.close();
				} catch(Exception e) {
					//do nothing
				}
			}
		}
	}
	
	public void write(Dao dao) throws SQLException {
		//same idea
	}
	
	public static class ConnectManager {
		private static final String DB_URL = "jdbc:mysql:///FppDb";
		private static final String USERNAME = "root";
		private static final String PASSWORD = "";
		public static Connection getConnection() throws SQLException {	
			Connection conn = DriverManager.getConnection(DB_URL, USERNAME,
					PASSWORD);
			System.out.println("Got connection...");
			return conn;
		}
	
	}
	
	
	
//	public static class ConnectManager {
//		
//		private static final String DB_URL 
//			= "jdbc:derby://localhost:1527/MPP_DB;create=true";
//		private static final String USERNAME = "app";
//		private static final String PASSWORD = "app";
//		private static Connection conn = null;
//		public Connection getConnection() throws SQLException {
//			if(conn == null) {	
//				conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
//				//System.out.println("Got connection...");
//			}
//			//System.out.println("Is conn null? " + (conn==null));
//			return conn;
//		}
//		
//		
//			
//	}

}
