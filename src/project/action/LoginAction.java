package project.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String username;
	private String password;
	
	@Override
	public String execute() throws Exception {
		
		if(username.equals("admin")) {
			return SUCCESS;
		} else {
			return ERROR;
		}

	}

	@Override
	public void validate() {
		if (username.length() == (0)) {
            this.addFieldError("user.username", "Name is required");
        }
        if (password.length() == (0)) {
            this.addFieldError("user.password", "Password is required");
        }
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
	
	

}
