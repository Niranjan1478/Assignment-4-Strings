package com.strings.programs;

import java.util.Scanner;

public class Palindrome
{

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{

	System.out.println("Enter the String to check palindrome");
	String s2=sc.next(); String s1="";

	char[]s=s2.toCharArray();
    
    for(int i=s.length-1;i>=0;i--)
        s1=s1+s[i];
        
    System.out.println("Palindrome="+s1.equals(s2));
    //System.out.println(s1);
    //System.out.println(s2);
    
}
}
