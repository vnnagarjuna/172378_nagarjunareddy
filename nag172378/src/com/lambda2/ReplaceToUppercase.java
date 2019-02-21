package com.lambda2;


import java.util.ArrayList;
import java.util.List;

public class ReplaceToUppercase {
	
		public static void main(String[] args) {
			List<String> array = new ArrayList<String>();
			array.add("nag");
			array.add("krishna");
			array.add("saiKrishna");
			array.add("haneef");
			System.out.println("Names :\n"+array);
			System.out.println("**********************************");
			
			array.replaceAll(sai -> sai.toUpperCase());
			array.forEach(System.out::println);
		}

	}



