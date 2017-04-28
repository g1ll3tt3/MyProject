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
import project.common.sqlHelper.ISqlHelperConnection;
import project.common.sqlHelper.ISqlHelperString;
import project.common.sqlHelperImpl.SqlHelperImpl;
import project.model.bean.Account;
import project.model.dao.IAccountDAO;
import project.model.enumClass.Active;

/**
 * @author Administrator
 *
 */
public class AccountDAOImpl implements IAccountDAO {
	private static AccountDAOImpl instance = null;
	
	private Connection cn = null;
	private PreparedStatement pstm = null;
	private ResultSet rs = null;
	
	private ISqlHelperString sHelperStr = SqlHelperImpl.getInstance();
	private ISqlHelperConnection sHelperCon = ConnectSql.getInstance();
	
	public AccountDAOImpl() throws ClassNotFoundException, SQLException {
		cn = sHelperCon.getConnect();
	}
	
	public static AccountDAOImpl getInstance() throws ClassNotFoundException, SQLException {
		if (instance == null)
			instance = new AccountDAOImpl();
		
		return instance;
	}
	
	@Override
	public boolean checkLogin(Account account) {
		try {
			String sel_account_id = sHelperStr.strSelectWithWhere(Contants.COL_ACCOUNTID, Contants.TAB_ACCOUNT, 
					Contants.COL_USERNAME + " = ? and " + Contants.COL_PASSWORD + " = ?");
			
			System.out.println(sel_account_id);
			
			pstm = cn.prepareStatement(sel_account_id);
			
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

	@Override
	public Account getAccountByUsername(String username) {
		Account account = null;
		
		try {
			String col = Contants.COL_USERNAME + ", " + Contants.COL_ACCOUNTID 
					+ ", " + Contants.COL_ISACTIVE + ", " + Contants.COL_ROLE + ", " + Contants.COL_PERSONID;
			
			String sel_account = sHelperStr.strSelectWithWhere(col, Contants.TAB_ACCOUNT, 
					Contants.COL_USERNAME + " = ?");
			
			System.out.println("SELECT account: " +sel_account);
			
			pstm = cn.prepareStatement(sel_account);
			pstm.setString(1, username);
			
			rs = pstm.executeQuery();
			
			if (rs.next()) {
				account = new Account();
				account.setAccountId(rs.getInt(Contants.COL_ACCOUNTID));
				account.setUsername(rs.getString(Contants.COL_USERNAME));
				account.setIsActive(rs.getInt(Contants.COL_ISACTIVE));
				account.setRole(rs.getString(Contants.COL_ROLE));
				account.setPersonId(rs.getInt(Contants.COL_PERSONID));
			}
		} catch (SQLException e) {
			// TODO write handle try catch sql
			e.printStackTrace();
		}

		return account;
	}

	@Override
	public Account getAccountById(int id) {
		Account account = null;
		
		try {
			String col = Contants.COL_USERNAME + ", " + Contants.COL_ACCOUNTID 
					+ ", " + Contants.COL_ISACTIVE + ", " + Contants.COL_ROLE + ", " + Contants.COL_PERSONID;
			
			String sel_account = sHelperStr.strSelectWithWhere(col, Contants.TAB_ACCOUNT, 
					Contants.COL_ACCOUNTID + " = ?");
			
			System.out.println("SELECT account: " +sel_account);
			
			pstm = cn.prepareStatement(sel_account);
			pstm.setInt(1, id);
			
			rs = pstm.executeQuery();
			
			if (rs.next()) {
				account = new Account();
				account.setAccountId(rs.getInt(Contants.COL_ACCOUNTID));
				account.setUsername(rs.getString(Contants.COL_USERNAME));
				account.setIsActive(rs.getInt(Contants.COL_ISACTIVE));
				account.setRole(rs.getString(Contants.COL_ROLE));
				account.setPersonId(rs.getInt(Contants.COL_PERSONID));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return account;
	}
	
	@Override
	public String getRoleByUsername(String username) {
		String sql = sHelperStr.strSelectWithWhere(Contants.COL_ROLE, Contants.TAB_ACCOUNT, Contants.COL_USERNAME + " = ?");
		
		try {
			pstm = cn.prepareStatement(sql);
			
			pstm.setString(1, username);
			
			rs = pstm.executeQuery();
			
			if (rs.next()) {
				return rs.getString(Contants.COL_ROLE);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public String getRoleByAccountId(int id) {
		String sql = sHelperStr.strSelectWithWhere(Contants.COL_ROLE, Contants.TAB_ACCOUNT, Contants.COL_ACCOUNTID + " = ?");
		
		try {
			pstm = cn.prepareStatement(sql);
			
			pstm.setInt(1, id);
			
			rs = pstm.executeQuery();
			
			if (rs.next()) {
				return rs.getString(Contants.COL_ROLE);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	@Override
	public List<Account> getListAccount() {
		// TODO List all account in database
		return null;
	}
	
	@Override
	public boolean checkExist(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Check active for account by username
	 */
	@Override
	public boolean checkIsActive(String username) {
		try {
			String sel_account = sHelperStr.strSelectWithWhere(Contants.COL_ISACTIVE, Contants.TAB_ACCOUNT, 
					Contants.COL_USERNAME + " = ?");
			
			System.out.println("SELECT isActive: " +sel_account);
			
			pstm = cn.prepareStatement(sel_account);
			pstm.setString(1, username);
			
			rs = pstm.executeQuery();
			
			if (rs.next()) {
				if (rs.getInt(Contants.COL_ISACTIVE) == Active.ACTIVE.value()) {
					return true;
				}
			}
		} catch (SQLException e) {
			// TODO handle exception
			e.printStackTrace();
		}
		
		return false;
	}
	
}
