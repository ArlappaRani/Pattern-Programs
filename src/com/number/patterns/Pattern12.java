package com.number.patterns;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number"); 
		int n=scan.nextInt();
		int Evencount=2;
		int Oddcount=1;
		//for loop for rows to printing even numbers
		for(int i=1;i<=n/2;i++)
		{
			//for numbers to be print 
	
	         
			for(int j=1;j<=n;j++)//columns
			{
				if(Evencount<=8)
				
				System.out.print("0"+Evencount+" ");
				else
				System.out.print(Evencount+" ");	
			    Evencount+=2;
			}
			
			System.out.println();//next line
		
		}
		//for printing odd numbers will take below for loop
		for(int i=n/2;i<=n-1;i++)
		{
			//for numbers to be print
	
	         
			for(int j=1;j<=n;j++)//columns
			{
				if(Oddcount<=9)
				
				System.out.print("0"+Oddcount+" ");
				else
				System.out.print(Oddcount+" ");	
			    Oddcount+=2;
			}
			
			System.out.println();//next line
		
		}
		}}


