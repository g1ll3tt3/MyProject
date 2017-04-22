package project.common.sqlHelperImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import project.common.ConnectSql;
import project.common.sqlHelper.ISqlHelperConnection;
import project.common.sqlHelper.ISqlHelperDatabase;
import project.common.sqlHelper.ISqlHelperString;

public class SqlHelperImpl implements ISqlHelperString, ISqlHelperDatabase {
	private Connection cn = null;
	
	private static SqlHelperImpl instance = null;
	private PreparedStatement pstm = null;
	private ResultSet rs = null;
	
	private ISqlHelperConnection sHelperCon = ConnectSql.getInstance();
	
	public SqlHelperImpl() throws ClassNotFoundException, SQLException {
		cn = sHelperCon.getConnect();
	}
	
	public static SqlHelperImpl getInstance() throws ClassNotFoundException, SQLException {
		if (instance == null) {
			instance = new SqlHelperImpl();
		}
		return instance;
	}

	@Override
	public String strSelect(String column, String table) {
		return "SELECT " + column + " FROM " + table;
	}

	@Override
	public String strSelectWithWhere(String column, String table, String condition) {
		return "SELECT " + column + " FROM " + table + " WHERE " + condition;
	}

	@Override
	public ResultSet select(PreparedStatement pstm) {
		try {
			rs = pstm.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return rs;
	}
	
	
}
