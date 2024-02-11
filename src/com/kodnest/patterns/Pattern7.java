package com.kodnest.patterns;
import java.util.Scanner;
public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("ENter the number");
		int n=scan.nextInt();
		System.out.println("Enter the character to be printed");
		char ch=scan.next().charAt(0);
		//using for loop
		for(int i=1;i<=n;i++)//To print rows
		{
			//To print n spaces in every row
			for(int j=1;j<=n;j++)
			{
				System.out.print(" "); 
			}
			//To print n starts in every columns
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();//next line 
		}
		}
}

	
