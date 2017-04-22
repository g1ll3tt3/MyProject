package project.common.sqlHelper;

public interface ISqlHelperString {
	
	public String strSelect(String column, String table);
	
	public String strSelectWithWhere(String column, String table, String condition);
	
}
