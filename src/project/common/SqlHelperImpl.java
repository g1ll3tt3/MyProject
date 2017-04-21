package project.common;

import java.sql.Connection;

public class SqlHelperImpl implements ISqlHelper {
	private Connection cn = null;
	
	private static SqlHelperImpl instance = null;
	
	public static SqlHelperImpl getInstance() {
		if (instance == null) {
			instance = new SqlHelperImpl();
		}
		return instance;
	}
	
	public String selColFromTabWhereCon(String col, String tab, String con) {
		return "SELECT " + col + " FROM " + tab + " WHERE " + con;
	}
}
