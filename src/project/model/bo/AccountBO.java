package project.model.bo;

import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import project.model.bean.Account;
import project.model.dao.IAccountDAO;
import project.model.daoImpl.AccountDAOImpl;

public class AccountBO {
	private static AccountBO instance = null;
	private IAccountDAO accountDao = null;
	
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
		try {
			
			if (accountDao.checkLogin(account)) {
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;	
	}
	
	/**
	 * Get all information of account use to id or username
	 * Status: Done
	 * @param id
	 * @return Account account
	 */
	public Account getAccountByIdOrUsername(String id) {
		Account account = new Account();
		
		// Check id is number or not number
		Pattern pattern = Pattern.compile("\\d*"); 
        Matcher matcher = pattern.matcher(id);
        
        if (matcher.matches()) { 
            account = accountDao.getAccountById(Integer.valueOf(id));
        } else { 
            account = accountDao.getAccountByUsername(id);
        }

		return account;
	}

	public String checkTypeAccByUsername(String usernameSession) {
		String role = "";
		
		Pattern pattern = Pattern.compile("\\d*"); 
        Matcher matcher = pattern.matcher(usernameSession);
        
        if (matcher.matches()) { 
            role = accountDao.getRoleByAccountId(Integer.valueOf(usernameSession));
        } else { 
            role = accountDao.getRoleByUsername(usernameSession);
        }
        
		return role;
	}
}
