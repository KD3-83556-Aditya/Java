package com.sunbeam;

import java.util.StringTokenizer;

public class program3 {

	public static void main(String[] args) {
		String s1="   Fronx Is Car,Vary Comfortable TO Drive.I Like TO Drive"; 
		int s2=s1.length();
		String s3=s1.trim();
		int s4=s3.length();

		
		
		System.out.println("s1 -"+s1);
		System.out.println("s2 -"+s2);
		System.out.println("s3 -"+s3);
		System.out.println("s4 -"+s4);
		
		
		StringTokenizer s5= new StringTokenizer(s3,",.");
		while(s5.hasMoreTokens());
		System.out.println(s5.nextToken());
		
		
		
		
		
	}

}
