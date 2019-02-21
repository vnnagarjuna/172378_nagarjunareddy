package com.lambda;

public class Arthematic {
	public static void main(String[] args) { 
		int x=10,y=12;
		
		Interfacefirst	Arthematic  = (int a,int b) -> (a+b);
		Interfacefirst	Arthematic1  = (int a,int b) -> (a-b);
		Interfacefirst	Arthematic2  = (int a,int b) -> (a*b);
		Interfacefirst	Arthematic3  = (int a,int b) -> (a/b);

int ans=Arthematic.method(x,y);
System.out.println(ans);

int ans1=Arthematic1.method(x,y);
System.out.println(ans1);

int ans2=Arthematic2.method(x,y);
System.out.println(ans2);

int ans3=Arthematic3.method(x,y);
System.out.println(ans3);

	 
	
}
	
	

}
