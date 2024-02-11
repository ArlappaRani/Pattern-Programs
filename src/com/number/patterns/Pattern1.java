package com.number.patterns;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number"); 
		int n=scan.nextInt();
		System.out.println("Enter the character to be printed");
		char ch=scan.next().charAt(0);
		//for loop for rows
		for(int i=1;i<=n;i++)
		{
			//for numbers to be print 
			for(int j=1;j<=n;j++)
			{
				System.out.print(i+" ");
				
			}
			System.out.println();//next line
		}
		

	}

}
