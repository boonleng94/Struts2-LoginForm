package cz3002.controller;

import com.opensymphony.xwork2.ActionSupport;
//import com.opensymphony.xwork2.util.ValueStack;

import cz3002.model.UserRepo;;

//Controller class to hold the Action for the User
//Each action is an encapsulation of requests and placed in ValueStack
//In this case, only LoginAction is needed to be defined as the web application only does login
public class LoginAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	//User credentials
	private String username;
	private String password;

	//Overridden method to define and implement the Login Action, following struts2 framework defined contract
	@Override
	public String execute() throws Exception {		
		//Not needed for this scenario
		//ValueStack stack = ActionContext.getContext().getValueStack();
		UserRepo repo = new UserRepo(getUsername(), getPassword());
		boolean isSuccess = repo.loginValidate();
		
		if (isSuccess)
			//Returns SUCCESS result to struts2.xml (the Controller)
			return SUCCESS;
		else {
			//Action error to return to View
			addActionError("Invalid username or password! Please try again!");
			return ERROR;
		}
	}
	
	//Getter for Username
	public String getUsername() {
		return username;
	}
	
	//Setter for Username
	public void setUsername(String username) {
		this.username = username;
	}
	
	//Getter for Password
	public String getPassword() {
		return password;
	}
	
	//Setter for Password
	public void setPassword(String password) {
		this.password = password;
	}

}
