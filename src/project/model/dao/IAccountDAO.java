package project.model.dao;

import java.util.List;

import project.model.bean.Account;

public interface IAccountDAO {
	public boolean checkLogin(Account account);
	public String getRoleByAccountId(String id);
	public boolean checkExist(String id);
	public boolean checkIsActive(String id);
	
	public Account getAccountInforById(String id);
	public List<Account> getListAccount();
}
