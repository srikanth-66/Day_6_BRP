package com.home;

import java.util.Scanner;

public class PrimeNumbersFromGivenRange 
{
	public static void main(String[] args) 
	{
		int start, end, i, j, count=0;        
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Range :");
		System.out.println("Enter Starting Number : ");
		start = scan.nextInt();
		System.out.println("Enter Ending Number : ");
		end = scan.nextInt();
		System.out.println("Prime Numbers Between " + start + " and " +end+ " is :\n");
		for(i=start; i<=end; i++)
		{
			count = 0;
			for(j=1; j<=i; j++)
			{
				if(i%j == 0)
				{
					count=count+1;

				}
			}
			if(count == 2)
			{
				System.out.print(i + " ");
			}
		}

	}
}