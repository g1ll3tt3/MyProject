package project.model.dao;

import java.sql.SQLException;
import java.util.List;

import project.model.bean.Account;

public interface IAccountDAO {
	public boolean checkLogin(Account account) throws SQLException;
	
	public String getRoleByAccountId(int id);
	
	public String getRoleByUsername(String username);
	
	public boolean checkExist(String id);
	
	public boolean checkIsActive(String id);
	
	public Account getAccountById(int id);
	
	public Account getAccountByUsername(String username);
	
	public List<Account> getListAccount();
}
