package project.model.bo;

import java.sql.SQLException;

import project.model.bean.Account;
import project.model.daoImpl.AccountDAOImpl;

public class AccountBO {
	private static AccountBO instance = null;
	private AccountDAOImpl accountDao = null;
	
	public AccountBO() {
		try {
			accountDao = AccountDAOImpl.getInstance();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static AccountBO getInstance() {
		if (instance == null)
			instance = new AccountBO();
		
		return instance;
	}

	public boolean checkLogin(Account account) {
		if (accountDao.checkLogin(account)) {
			return true;
		} else {
			return false;
		}
			
	}
}
