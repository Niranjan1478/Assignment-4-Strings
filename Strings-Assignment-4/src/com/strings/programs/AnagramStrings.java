package com.strings.programs;

import java.util.Scanner;

public class AnagramStrings {

	public static void main(String[] args)
	{

		 	System.out.println("Enter the Strings to check anagram or not");
		    
	        try (Scanner sc = new Scanner(System.in)) 
	        {
				char[]c1=sc.nextLine().replace(" ", "").toLowerCase().toCharArray();
				char[]c2=sc.nextLine().replace(" ", "").toLowerCase().toCharArray();
				
				int sum1=0,sum2=0;
				String notAnagram="Not an Anagram Strings";
				if(c1.length==c2.length)
				{
				    for(int i=0;i<c1.length;i++)
				    {
				        sum1=sum1+c1[i];
				        sum2=sum2+c2[i];
				    }
				
				}
				else
				{
				    System.out.println(notAnagram);
				    System.exit(0);
				}
				
				if(sum1==sum2)
				    System.out.println(" : ) Anagram Strings");
				else
				    System.out.println(notAnagram);
			}
	}

}
