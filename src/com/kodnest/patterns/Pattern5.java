package com.kodnest.patterns;
import java.util.Scanner;
public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the rows");
		int row =scan.nextInt();
		System.out.println("Enter the columns");
		int col=scan.nextInt();
		System.out.println("Enter the character to be printed");
        char ch=scan.next().charAt(0);
        //Using the for loop
      /*  for(int i=1;i<=row;i++)//for rows
        {
        	for(int j=1;j<=i;j++)//for columns
        	{
        		System.out.print("*");
        	}
        	System.out.println(); 
        }
	}

}*/
        //Using while loop
       /* int i=1;//initialization i value
        while(i<=row)//for rows outer loop
        {
        	int j=1;//initializing j value
        	while(j<=i)//if j columns less than rows then in first row single value printed
        	{
        		System.out.print("*");
        		j++;
        	}
        	System.out.println();//new line
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
        		System.out.print(ch);
        		j++;
        	}
        	while(j<=i);
       	System.out.println();
       	i++;
        }
        while(i<=row);
	}
}


        
