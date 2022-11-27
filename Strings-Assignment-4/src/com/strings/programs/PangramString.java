package com.strings.programs;

import java.util.Scanner;
public class PangramString
{
	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in);)
		{
			System.out.println("Enter the String to check Pangram or not");
			char[]c1=sc.nextLine().replace(" ", "").toUpperCase().toCharArray();
			char[]c2=new char[26];
			
			String s1="PANGRAM STRING ";
			
			for(int i=0;i<c1.length;i++)
			{
				int b=0;
				b=c1[i]-65;
				c2[b]=1;
			}
			for(int i:c2)
				if(i==0)
					s1="NOT A PANGRAM STRING";
	
			System.out.println(s1);
		}
	}
}