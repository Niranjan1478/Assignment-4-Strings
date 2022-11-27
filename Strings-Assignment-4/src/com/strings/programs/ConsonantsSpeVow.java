package com.strings.programs;
import java.util.Scanner;

//count the number of consonants, vowels, special characters in a String.
public class ConsonantsSpeVow
{
	public static void main(String[] args)
	{
		try(Scanner sc=new Scanner(System.in);)
		{
			System.out.println("Enter the String to check no of vol, conso and spe");
			 
			char[]c1=sc.nextLine().replace(" ", "").toCharArray();
				
		    int vol=0,con=0,spe=0;
		    
		    for(int i=0;i<c1.length;i++)
		    {
		        if(
		            c1[i]=='A'||c1[i]=='E'||c1[i]=='I'||c1[i]=='O'||c1[i]=='U' ||
		            
		            c1[i]=='a'||c1[i]=='e'||c1[i]=='i'||c1[i]=='o'||c1[i]=='u' 
		          )
		          vol++;
		          else if(
		            c1[i]=='B'||c1[i]=='C'||c1[i]=='D'||c1[i]=='F'||c1[i]=='G' ||
		            
		            c1[i]=='H'||c1[i]=='J'||c1[i]=='K'||c1[i]=='L'||c1[i]=='M' ||
		            
		            c1[i]=='N'||c1[i]=='P'||c1[i]=='Q'||c1[i]=='R'||c1[i]=='S' ||
		            
		            c1[i]=='T'||c1[i]=='V'||c1[i]=='W'||c1[i]=='X'||c1[i]=='Y' ||
		            
		            c1[i]=='Z' ||
		            
		            
		            c1[i]=='b'||c1[i]=='c'||c1[i]=='d'||c1[i]=='f'||c1[i]=='g' ||
		            
		            c1[i]=='h'||c1[i]=='j'||c1[i]=='k'||c1[i]=='l'||c1[i]=='m' ||
		            
		            c1[i]=='n'||c1[i]=='p'||c1[i]=='q'||c1[i]=='r'||c1[i]=='s' ||
		            
		            c1[i]=='t'||c1[i]=='v'||c1[i]=='w'||c1[i]=='x'||c1[i]=='y' ||
		            
		            c1[i]=='z' 
		            
		            )
		            con++;
		          else
		          spe++;
		    }
		    System.out.println("Vowels = "+vol);
		    System.out.println("Consonants= "+con);
		    System.out.println("Special Characters = "+spe);
		}
	}
}
