package project.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import project.common.Contants;
import project.common.SessionUtils;
import project.model.bean.Account;
import project.model.bo.AccountBO;

public class LoginAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	
	
	private AccountBO accountBo = AccountBO.getInstance();
	private Account account;
	
	/**
	 * Show login page for user access to system
	 * Status: Done(16:00 22/04/2017)
	 * @return
	 * @throws Exception
	 */
	public String showLogin() throws Exception {
		if (SessionUtils.getInstance().checkSessionEmpty().equals(Contants.SES_NOT_EXIST_SESSION)) {
			return Contants.SHOW_lOGIN;
		} else if (SessionUtils.getInstance().checkSessionEmpty().equals(Contants.SES_EXIST_SESSION)) {
			return Contants.LOGIN_EXIST;
		} else {
			return Contants.ERROR_SHOW_lOGIN;
		}
	}
	
	public String checkLogin() throws Exception {
		Map<String, Object> session = ActionContext.getContext().getSession();
		
		if (SessionUtils.getInstance().checkSessionEmpty().equals(Contants.SES_NOT_EXIST_SESSION)) {
			if (account != null) {
				if (accountBo.checkLogin(account)) {
					
					Account accLogin = new Account();
					
					accLogin = accountBo.getAccountByIdOrUsername(account.getUsername());
					
					session.put(Contants.KEY_MAP_SESSION_USERNAME, accLogin.getUsername());
					session.put(Contants.KEY_MAP_SESSION_ACCOUNT_ID, accLogin.getAccountId());
					session.put(Contants.KEY_MAP_SESSION_IS_ACTIVE, accLogin.getIsActive());
					session.put(Contants.KEY_MAP_SESSION_ROLE, accLogin.getRole());
					session.put(Contants.KEY_MAP_SESSION_PERSON_ID, accLogin.getPersonId());
					
					return SUCCESS;
				} else {
					return ERROR;
				}
			} else {
				return Contants.SHOW_lOGIN;
			}

		}
		if (SessionUtils.getInstance().checkSessionEmpty().equals(Contants.SES_EXIST_SESSION)) {
			return SUCCESS;
		} else {
			return ERROR;
		}

	}

	public String logout() throws Exception {
		Map<String, Object> session = ActionContext.getContext().getSession();
		
		if (SessionUtils.getInstance().checkSessionEmpty().equals(Contants.SES_EXIST_SESSION)) {
			session.remove(Contants.KEY_MAP_SESSION_USERNAME);
			session.remove(Contants.KEY_MAP_SESSION_ACCOUNT_ID);
			session.remove(Contants.KEY_MAP_SESSION_IS_ACTIVE);
			session.remove(Contants.KEY_MAP_SESSION_ROLE);
			session.remove(Contants.KEY_MAP_SESSION_PERSON_ID);
			
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
