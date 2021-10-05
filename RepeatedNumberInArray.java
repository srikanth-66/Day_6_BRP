package com.home;

import java.util.Scanner;

public class RepeatedNumberInArray 
{
	public static void numberEnteredTwice(int[] array,int n)
	{
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(array[i]==array[j])
				{
					System.out.println("Number entered twice is"+" "+array[j]);
					
				}

			}
		}
		}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of an array:-");
		int size=sc.nextInt();
		int array []=new int[size];
		System.out.println("Enter the Array Elemnts:-");
		int n=array.length;
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("The entered array elemnts are:-");
		for(int i=0;i<size;i++)
		{
			System.out.println(array[i]);	
			
		}
		
		numberEnteredTwice(array,n);
		
		
	}

}
