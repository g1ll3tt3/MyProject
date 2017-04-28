package project.action;

import java.util.Map;

import org.apache.struts2.components.ActionError;

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
				
				//TODO call function encrypt password
				// call function encrypt at StringUtils class
				
				if (accountBo.checkLogin(account)) {
					if (accountBo.isActive(account.getUsername())) {
						Account accLogin = new Account();
						
						accLogin = accountBo.getAccountByIdOrUsername(account.getUsername());
						
						session.put(Contants.KEY_MAP_SESSION_ACCOUNT, accLogin);

//						session.put(Contants.KEY_MAP_SESSION_USERNAME, accLogin.getUsername());
//						session.put(Contants.KEY_MAP_SESSION_ACCOUNT_ID, accLogin.getAccountId());
//						session.put(Contants.KEY_MAP_SESSION_IS_ACTIVE, accLogin.getIsActive());
//						session.put(Contants.KEY_MAP_SESSION_ROLE, accLogin.getRole());
//						session.put(Contants.KEY_MAP_SESSION_PERSON_ID, accLogin.getPersonId());
						
						return SUCCESS;
						
					} else {
						
						this.addActionError("Access denied !!!");
						
						return Contants.SHOW_lOGIN;
					}
					
				} else {
					this.addActionError("I don't know you, dont try to hack me!");
					
					return Contants.SHOW_lOGIN;
				}
				
			} else {
				return Contants.SHOW_lOGIN;
			}

		}
		
		if (SessionUtils.getInstance().checkSessionEmpty().equals(Contants.SES_EXIST_SESSION)) {
			if (SessionUtils.getInstance().checkIsActive()) {
				return SUCCESS;
			} else {
				return ERROR;
			}
		} else {
			return ERROR;
		}

	}

	/**
	 * Logout (delete session)
	 * Status: DONE
	 * @return String
	 * @throws Exception
	 */
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
	
	//TODO validate for Login form
	
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
