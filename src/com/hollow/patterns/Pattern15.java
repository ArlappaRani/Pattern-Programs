package com.hollow.patterns;
import java.util.Scanner;
public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		System.out.println("Enter the character to be printed"); 
		char ch=scan.next().charAt(0);
		//for rows
		for(int i=1;i<=num;i++)
		{
			//for n no of spaces in each  row
			for(int j=1;j<=num;j++)
			{
				System.out.print(" "); 
			}
			//for n starts and spaces
			for(int j=1;j<=i;j++)
			{
				if(i==1||i==5||j==i||j==1)
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


