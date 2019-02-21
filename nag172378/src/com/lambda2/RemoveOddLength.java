package com.lambda2;

import java.util.ArrayList;
import java.util.List;

public class RemoveOddLength {

	public static void main(String[] args) {
		
		List<String> array = new ArrayList<String>();
		array.add("Sai");
		array.add("nag");
		array.add("SaiKrishna");
		array.add("haneef");
		System.out.println("Names :\n"+array);
		System.out.println("**********************************");
		
		array.removeIf(saik -> saik.length() % 2 == 1);
		array.forEach(System.out::println);
	}

}
