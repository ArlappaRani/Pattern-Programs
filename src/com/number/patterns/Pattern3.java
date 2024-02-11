package com.number.patterns;
import java.util.Scanner;
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number"); 
		int n=scan.nextInt();
		
		//for loop for rows
		for(int i=1;i<=n;i++)
		{
			//for numbers to be print 
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
				
			}
			System.out.println();//next line
		}
	}
	

	}


