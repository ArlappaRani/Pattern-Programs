package com.kodnest.patterns;
import java.util.Scanner;
public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of row");
		int row=scan.nextInt();
		System.out.println("Enter the value of col");
		int col=scan.nextInt();
        System.out.println("Enter the character to be printed");
		char ch=scan.next().charAt(0);
		//using for loop
	/*	for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row-i+1;j++)
			{
				System.out.print("*"); 
			}
			System.out.println();
		}}
}*/
 //Using the while loop
	/*	int i=1;
		while(i<=row)
		{
			int j=1;
			while(j<=row-i+1)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
}
}*/
//Using do while loop
	int i=1;
	do
	{
		int j=1;
		do
		{
			System.out.print("*");
			j++;
		}
		while(j<=row-i+1);
		System.out.println();
		i++;
	}
	while(i<=row);
	}
}