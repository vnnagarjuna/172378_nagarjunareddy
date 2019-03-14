package com.org.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.org.pojo.User;

public class ClassDao {
	

		public String insert(User user)
		{
			try {

			String sql =  "insert into registration values (?,?,?,?,?)";
			Connection con=ConnectionFactory.getConnection();
			PreparedStatement pst=con.prepareStatement(sql);
				      
					  pst.setString(1, user.getFname());
					  pst.setString(2, user.getLname());
					  pst.setString(3, user.getUname());
					  pst.setString(4, user.getEmail());
					  pst.setString(5, user.getPass());
					  
					  pst.executeUpdate();
					} 
		    catch (Exception e) {
		              e.printStackTrace();

					}
					return "inserted";
	}
		
		public boolean validate(String email,String password) {
			
			
			try {
			 //String queryString = "SELECT * FROM users where user_emailid=? and user_password=?";
				Connection con=ConnectionFactory.getConnection();
						String query = "SELECT user_emailid, user_password FROM users";
				
			     Statement s=con.createStatement();
			      
			     
			      ResultSet results =s.executeQuery(query);
			    
				
				 while (results.next())
				 { 
					 String emailid = results.getString("user_emailid");
				  String pass = results.getString("user_password");
				  
				 if ((email.equals(emailid)) && (password.equals(pass)))
				 { 
					 
					 return true;
				
				 } 
				 
				 }
				
			      
			}
			catch (Exception e) {
				 e.printStackTrace();
			}
			return false;
			 
			
			
		}
		
		
		
		
		
		public String delete(String emailid,String password,String phonenumber)
		{
			String sql1="delete from users where(?)";
			
			return "deleted";
			
		}
		
		
		
	}


