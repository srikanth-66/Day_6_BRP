package com.home;

import java.util.Scanner;

public class PrintingDash
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows u want  of the array");
		int rows=sc.nextInt();
		System.out.println("enter the columns u want  of the array");
		int columns=sc.nextInt();
		int arr[][]=new int[rows][columns];
		int n=arr.length;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=columns;j++)
			{
				System.out.print("-");

			}
			System.out.println();
		}
	}

}
