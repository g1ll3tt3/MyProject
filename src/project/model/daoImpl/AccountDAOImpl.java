/**
 * 
 */
package project.model.daoImpl;

import java.util.List;

import project.model.bean.Account;
import project.model.dao.IAccountDAO;

/**
 * @author Administrator
 *
 */
public class AccountDAOImpl implements IAccountDAO {

	/* (non-Javadoc)
	 * @see project.model.dao.IAccountDAO#checkLogin(project.model.bean.Account)
	 */
	@Override
	public boolean checkLogin(Account account) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see project.model.dao.IAccountDAO#getRoleByAccountId(java.lang.String)
	 */
	@Override
	public String getRoleByAccountId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see project.model.dao.IAccountDAO#checkExist(java.lang.String)
	 */
	@Override
	public boolean checkExist(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see project.model.dao.IAccountDAO#checkIsActive(java.lang.String)
	 */
	@Override
	public boolean checkIsActive(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see project.model.dao.IAccountDAO#getAccountInforById(java.lang.String)
	 */
	@Override
	public Account getAccountInforById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see project.model.dao.IAccountDAO#getListAccount()
	 */
	@Override
	public List<Account> getListAccount() {
		// TODO Auto-generated method stub
		return null;
	}

}
