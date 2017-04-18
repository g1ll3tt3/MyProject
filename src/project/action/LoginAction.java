package project.action;

import com.opensymphony.xwork2.ActionSupport;

import project.model.bean.Account;

public class LoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Account account;
	
	@Override
	public String execute() throws Exception {
		
		if(account.getUsername().equals("admin")) {
			return SUCCESS;
		} else {
			return ERROR;
		}

	}

	@Override
	public void validate() {
		if (account.getUsername().length() == (0)) {
            this.addFieldError("user.username", "Name is required");
        }
        
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
}
