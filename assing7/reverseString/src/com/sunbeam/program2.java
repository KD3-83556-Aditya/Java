package com.sunbeam;

public class program2 {

	public static void main(String[] args) {
		StringBuffer s1 =new StringBuffer("Adi");
		StringBuffer s2 = s1.reverse();
		
			if(s1.equals(s2))
			{ 
				System.out.println("String is polindrom ");
				
			}
			
			else
			{
				System.out.println("String is not polindrom");
			}
	}
}