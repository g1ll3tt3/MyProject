package project.common.sqlHelper;

import java.sql.Connection;
import java.sql.SQLException;

public interface ISqlHelperConnection {
	public Connection getConnect() throws ClassNotFoundException, SQLException;
}
