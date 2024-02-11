package com.hollow.patterns;
import java.util.Scanner;
public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		System.out.println("Enter the character to be printed"); 
		char ch=scan.next().charAt(0);
		//using for loop for rows
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num-i+1;j++)//for spaces
			{
				System.out.print(" ");
			}
			for(int j=1;j<=num;j++)//for starts and spaces
			{
				if(i==1||j==1||j==num-i+1)
				{
				System.out.print(ch);  
			    }
				else
				{
					System.out.print(" ");
				}
		}
			System.out.println();//next line 
	}
	}
}
