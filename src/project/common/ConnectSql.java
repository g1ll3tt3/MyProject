package project.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectSql {
	private static ConnectSql instance = null;
	private String IP = "localhost";
	private String PORT = "1433";
	private String DATABASE_NAME = "ProjectManagement";
	private String URL = "jdbc:sqlserver://" + IP + ":" + PORT + ";databaseName=" + DATABASE_NAME + "";
	private String USERNAME = "sa";
	private String PASSWORD = "12345678";
	private Connection connection = null;
	
	public ConnectSql() {
		
	}
	
	/**
	 * Áp dụng singlethon
	 * @return
	 */
	public static ConnectSql getInstance() {
		if(instance == null)
			instance = new ConnectSql();
		
		return instance;
	}
	
	public Connection getConnect() throws ClassNotFoundException, SQLException{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		System.out.println("Ket noi thanh cong");
		
		return connection;
	}
}
