package com.kodnest.patterns;
import java.util.Scanner; 
public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		System.out.println("Enter the character to be printed"); 
		char ch=scan.next().charAt(0);
		//using for loop
		for(int i=1;i<=n;i++)//for rows
		{
			for(int j=1;j<=n-i+1;j++) {//for spaces
				System.out.print(" ");
			}
			for(int j=1;j<=n-i+1;j++)//for starts
			{
				System.out.print(ch);
			}
			System.out.println();//next line
		}
		
	}

}
