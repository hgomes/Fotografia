package com.projeto.control;

import com.opensymphony.xwork2.ActionSupport;


public class HelloStruts2 extends ActionSupport  {

	private String _name;
	
	public HelloStruts2() { 
		 
	}
	
	@Override
	public String execute() {
		
		System.out.println("passei pelo execute !");
		
		_name = "José";
		
		return "execute"; 
	}
	
	public String getName(){ 
		
		return _name;
	}
	
	public void setName(String name){ 
		
		_name = name;
	}

}
