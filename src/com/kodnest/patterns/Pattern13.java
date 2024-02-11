package com.kodnest.patterns;
import java.util.Scanner;
public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		System.out.println("Enter the character");
		char ch=scan.next().charAt(0);
		//for loop for rows
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i+1;j++)//for spaces
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)//for starts
			{
				if(i==5)
				{
					continue;
				}
				
					System.out.print(ch);
			}
		System.out.println();	
		}
		
		//activity 2
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)//for spaces
			{
				System.out.print(" ");
			}
			for(int j=1;j<=11-2*i;j++)//for starts
			{
				
				
					System.out.print(ch);
				
			}
			System.out.println();//for next line
		}
	
	
		

	}

}

	


