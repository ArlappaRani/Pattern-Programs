package com.kodnest.patterns;
import java.util.Scanner;
public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the rows");//for rows
		int row=scan.nextInt();
		System.out.println("Enter the columns");//for columns taking user input
		int col=scan.nextInt();
		System.out.println("Enter the character to be printed");//for character which we print
		char ch=scan.next().charAt(0);
		//using for loop
		
		/*
		for(int i=1;i<=row;i++)//for rows
		{
			for(int j=1;j<=col;j++)//for columns
			{
				System.out.print(ch);
			}
			System.out.println();//for next line
		}

	}

}*/
		//Using the while loop
	/*	int i=1;
		while(i<=row)//for rows
		{
			int j=1;
			while(j<=col)
			{
				System.out.print(ch);//for columns
				 j++;
				
			}
		System.out.println();//for next line 
		i++;
		}
	}
}*/

//Using the do while loop
int i=1;
do
{
//for columns Inner loop		
int j=1;
	do
	{
		
		System.out.print(ch);
		j++;
	}
	while(j<=col);//for columns
	System.out.println();
	i++;
}
while(i<=row);//for rows checking condition
	}
}






		
		
		
		
		
		
		
		
		
