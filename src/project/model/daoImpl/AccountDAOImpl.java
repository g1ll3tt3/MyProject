/**
 * 
 */
package project.model.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import project.common.ConnectSql;
import project.common.Contants;
import project.common.SqlHelperImpl;
import project.model.bean.Account;
import project.model.dao.IAccountDAO;

/**
 * @author Administrator
 *
 */
public class AccountDAOImpl implements IAccountDAO {
	private static AccountDAOImpl instance = null;
	private Connection cn = null;
	private PreparedStatement pstm = null;
	private ResultSet rs = null;
	private SqlHelperImpl sql = null;
	
	public AccountDAOImpl() throws ClassNotFoundException, SQLException {
		cn = ConnectSql.getInstance().getConnect();
		sql = SqlHelperImpl.getInstance();
	}
	
	public static AccountDAOImpl getInstance() throws ClassNotFoundException, SQLException {
		if (instance == null)
			instance = new AccountDAOImpl();
		
		return instance;
	}
	
	/* (non-Javadoc)
	 * @see project.model.dao.IAccountDAO#checkLogin(project.model.bean.Account)
	 */
	@Override
	public boolean checkLogin(Account account) {
		String sql_str = sql.selColFromTabWhereCon(Contants.COL_ACCOUNTID, 
				Contants.TABLE_ACCOUNT, Contants.COL_USERNAME + " = ? and " + Contants.COL_PASSWORD + " = ?");
		System.out.println(sql_str);
		
		try {
			pstm = cn.prepareStatement(sql_str);
			pstm.setString(1, account.getUsername());
			pstm.setString(2, account.getPassword());
			
			rs = pstm.executeQuery();
			
			if (rs.next()) {
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
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
