package com.org.pojo;

public class User {
	private  String fname;
	private String lname;
	private String uname;
	private String email;
	private String pass;
	public User(String fname, String lname, String uname, String email, String pass) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.uname = uname;
		this.email = email;
		this.pass = pass;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + ", uname=" + uname + ", email=" + email + ", pass=" + pass
				+ "]";
	}
	
	
	
	}
       
	
