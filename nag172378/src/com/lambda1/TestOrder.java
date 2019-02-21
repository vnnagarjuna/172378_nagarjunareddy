package com.lambda1;
import java.util.*;

	public class TestOrder {
		
		public static void main(String args[]){
			
		MyInterfaceOrder p=(amount) ->
			{	
			if(amount>10000)
			{
				System.out.println("accepted");
				
		  	}
			
			else
				System.out.println("not accepted");
		};
		
	   p.order(100000);
		}

	}



