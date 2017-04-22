/**
 * 
 */
package project.action;

import com.opensymphony.xwork2.ActionSupport;

import project.common.Contants;
import project.common.SessionUtils;
import project.model.bo.AccountBO;
import project.model.enumClass.Role;

/**
 * @author Administrator
 *
 */
public class ManagementAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	SessionUtils session = SessionUtils.getInstance();

	/**
	 * Status: Done
	 */
	@Override
	public String execute() throws Exception {
		if (session.checkSessionEmpty().equals(Contants.SES_NOT_EXIST_SESSION)) {
			return Contants.SHOW_lOGIN;
		} else if (session.checkSessionEmpty().equals(Contants.SES_EXIST_SESSION)) {
			if (session.checkSessionType().equals(Contants.SES_IS_ADMIN_SESSION)) {
				AccountBO accountBo = AccountBO.getInstance();
				
				String username = session.getUsernameSession();
				
				if (accountBo.checkTypeAccByUsername(username).equals(Role.ADMIN.value())) {
					return SUCCESS;
				}
			}
			
			return Contants.NOT_ADMIN;
		} else {
			return ERROR;
		}
	}
}
