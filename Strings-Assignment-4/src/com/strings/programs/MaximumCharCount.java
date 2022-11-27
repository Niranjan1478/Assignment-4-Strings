package com.strings.programs;

import java.util.Scanner;

public class MaximumCharCount
{
	 public static void main(String[] args)
	    {
		 try(Scanner sc=new Scanner(System.in);)
		 {
			System.out.println("Enter the Strings find Maximum occurance char");
		 
			char[]s=sc.nextLine().replace(" ", "").toCharArray();
			
	        int max=0;String s11="";String s12="";

	        for(int i=0;i<s.length;i++)
	        {
	            int c=0;
	            for(int j=0;j<s.length;j++)
	            {
	                if(s[i]==s[j])
	                    c=c+1;
	            }
	            if(c>max)
	            {
	                max=c;
	                s11=s11+max;
	                s12=s12+s[i];
	            }
	        }
	        //System.out.println(s11+s12);
	        char [] s13=s12.toCharArray();
			char [] s14=s11.toCharArray();
	        System.out.println("Character is :"+s13[s13.length-1]);
	        System.out.println("count is :"+s14[s14.length-1]);   
		 }
	    }
}
