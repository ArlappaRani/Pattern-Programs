package com.kodnest.patterns;
import java.util.Scanner;
public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		System.out.println("Enter the character to be printed");
		char ch=scan.next().charAt(0);
		//for rows
		for(int i=1;i<=num;i++)
		{
			//for n spaces in each row
			for(int j=1;j<=num;j++)
			{
				System.out.print(" ");
			}
			//for n starts/spaces in rows
			for(int j=1;j<=num;j++)
			{
				if(i==1||i==5||j==1||j==5)
				{
				System.out.print(ch);	
				}
				else
				{
				System.out.print(" ");
			}
			}
			System.out.println();//for next line
		}

	}
}




