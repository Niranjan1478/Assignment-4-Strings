package com.strings.programs;

import java.util.Scanner;
//to remove Duplicates from a String. // SSASB
public class RemoveDuplicates
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter the String to Remove Duplicates");
		String s1=sc.next();//Hello
		String s2="";
		char [] c1=s1.toCharArray();
		for(int i=0;i<c1.length;i++)
		{
			int count=0;
			for(int j=i;j<c1.length;j++)
			{
				if(c1[i]==c1[j])
				{
					count++;
				}
			}
			if(count==1)
				s2=s2+c1[i];		
		}
		System.out.println("Output : "+s2);
	}

}
