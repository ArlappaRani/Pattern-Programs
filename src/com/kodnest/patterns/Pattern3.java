package com.kodnest.patterns;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		for(int i=1;i<=5;i++)//for rows
		{
			for(int j=1;j<=5;j++)//for columns
			{
				System.out.print("*");//print stars in columns 
			}
			System.out.println();//next line
		}

	}

}*/
//Using while loop
		/*
		int i=1;
		while(i<=5)
		{
			int j=1;
			while(j<=5)
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
			
		   int j=1;//
		   do
		   {
			   System.out.print("*");
			   j++;
		   }
		   while(j<=5);//for columns
		   System.out.println();
		   i++;
		}
		while(i<=5);//for rows
		
	}
}

		   


