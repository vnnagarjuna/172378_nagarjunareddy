package com.stream1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class TransactionMain {

	public static void main(String[] args) {
		List<Transaction>list = new ArrayList<>(); 
		
	    list.add(new Transaction(new Trader("Ammy","Punjab"),2011,3500));
		list.add(new Transaction(new Trader("Mia","Mumbai"),2012,3000));
		list.add(new Transaction(new Trader("Tanya","Delhi"),2016,2000));
		list.add(new Transaction(new Trader("zoya","Pune"),2011,4500));
		list.add(new Transaction(new Trader("Prerna","Kolkata"),2011,1500));
		
		List<Trader> list2 =list.stream()
				.filter(t->t.getYear()==2011)
				.sorted(Comparator.comparing(Transaction::getValue))
				.map(Transaction::getTrader)
				.collect(Collectors.toList());
		list2.forEach(System.out::println);
		System.out.println("----------------------------------------------");
				


	}

}
