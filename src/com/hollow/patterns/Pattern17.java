package com.hollow.patterns;
import java.util.Scanner;
public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		System.out.println("Enter the character to be printed");
		char ch=scan.next().charAt(0);
		//for loop for rows
		for(int i=1;i<=n;i++)
		{
			//for loop for n no of spaces in each row
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print(" ");
			}
			//for loop for n starts and spaces in each row
			for(int j=1;j<=2*i-1;j++)
			{
				if(i==1||i==5||j==2*i-1||j==1)//for starts and spaces
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
