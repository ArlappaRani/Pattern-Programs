package com.kodnest.patterns;
import java.util.Scanner;
public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the rows and columns to be printed");
		int n=scan.nextInt();
		System.out.println("Enter the character you have to printed");
		char ch=scan.next().charAt(0);
		//using for loop for rows
		for(int i=1;i<=n;i++)
		{
			//for loop for n number spaces to printed
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "); //for spaces printing
			}
		//for n no of starts to be printed	
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch);//for starts
			}
			System.out.println();//for next line
		}
		
	}

}
