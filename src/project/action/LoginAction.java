package project.action;

import com.opensymphony.xwork2.ActionSupport;

import project.model.bean.Account;
import project.model.bo.AccountBO;

public class LoginAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	private AccountBO accountBo = AccountBO.getInstance();
	private Account account;
	
	public String showLogin() throws Exception {
		
		return SUCCESS;

	}
	
	public String login() throws Exception {
		if (accountBo.checkLogin(account)) {
			return SUCCESS;
		} else {
			return ERROR;
		}

	}

//	@Override
//	public void validate() {
//		if (account.getUsername().length() == (0)) {
//            this.addFieldError("user.username", "Name is required");
//        }
//        
//	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
}
