package project.action;

import com.opensymphony.xwork2.ActionSupport;

import project.model.bean.Account;

public class LoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Account account;
	
	public String showLogin() throws Exception {
		
		return SUCCESS;

	}
	
	public String checkLogin() throws Exception {
		
		if ("admin".equals(account.getUsername())) {
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
