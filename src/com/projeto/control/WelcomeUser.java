package com.projeto.control;

import com.opensymphony.xwork2.ActionSupport;

public class WelcomeUser extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private String message;
	
	@Override
	public String execute() {
		
		System.out.println("Testando...");
		
		message = "Welcome " + userName;
		return SUCCESS;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
 
	public void setMessage(String message) {
		this.message = message;
	}
 
	public String getUserName() {
		return userName;
	}
 
	public String getMessage() {
		return message;
	}
}
