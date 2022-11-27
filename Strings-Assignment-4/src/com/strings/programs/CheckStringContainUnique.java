package com.strings.programs;

import java.util.Scanner;

public class CheckStringContainUnique
{
	public static void main(String[] args)
    {
		try(Scanner sc=new Scanner(System.in);)
		{
			System.out.println("Enter the Strings find all Unique Characters or not");

			char[]s=sc.nextLine().replace(" ", "").toCharArray();
			
			String s1=":)Above String Contain All Unique Characters";
			
	        for(int i=0;i<s.length;i++)
	        {
	            int c=0;
	            for(int j=0;j<s.length;j++)
	            {
	                if(s[i]==s[j])
	                    c=c+1;
	            }
	            if(c!=1)
	                s1=" (: Above String Not Contain All Unique Characters";
	                
	        }
	        System.out.println(s1);
	    }
    }

}
