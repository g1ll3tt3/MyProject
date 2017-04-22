package project.common.sqlHelper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public interface ISqlHelperDatabase {
	public ResultSet select(PreparedStatement pstm);
	
}
