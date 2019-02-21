package com.lambda2;

import java.util.ArrayList;
import java.util.List;


public class Firstletter {
	public static void main(String[] args) {
		List<String> array = new ArrayList<String>();
		array.add("Sai");
		array.add("nag");
		array.add("haneed");
		array.add("mahesh");
		System.out.println("Names :\n"+array);
		System.out.println("**********************************");
	
		String result = array.stream().map(sai -> Character.toString(sai.charAt(0))).reduce(" ", (a, b) -> a + b);
		System.out.println(result);
	
	}

}
