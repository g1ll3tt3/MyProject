/**
 * 
 */
package project.model.bean;

/**
 * @author Administrator
 *
 */
public class Account {
	private int accountId;
	private String username;
	private String password;
	private String role;
	private int isActive;
	private int personId;
	
	public Account() {
		
	}

	public Account(String username, String password, String role, int isActive, int personId) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
		this.isActive = isActive;
		this.personId = personId;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}
}
