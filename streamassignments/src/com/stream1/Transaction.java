package com.stream1;

public class Transaction {
	Trader trader; 
	int year; 
	int value;
	public Transaction(Trader trader, Integer year, Integer value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	public void Transaction1(Trader trader2, Integer year2, Integer value2) {
		// TODO Auto-generated constructor stub
	}
	public Trader getTrader() {
		return trader;
	}
	public void setTrader(Trader trader) {
		this.trader = trader;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Transaction [trader=" + trader + ", year=" + year + ", value="
				+ value + "]";
	} 

}
