package com.home;
import java.util.Scanner;
public class NumericArraySort
{
	public static void sortNumberArray(int arr[],int n)
	{
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])//5 4 7 1
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("orderd array is");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
	public static void sortStringArray(String arr1[],int n)
	{
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr1[i].compareTo(arr1[j])>0)
				{
					String temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
				
			}
		}
		System.out.println("Sorted String array");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr1[i]);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int n=arr.length;
		System.out.println("enter thearray elements");
		for(int i=0;i<n;i++)
		{
			int num=sc.nextInt();
			arr[i]=num;
		}
		System.out.println("Displyaing array elements");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		/*
		 * System.out.println("enter the size of the string array");
		 * int size=sc.nextInt();
		 * String [] numbers=new String[size];
		 * int n1=arr.length;
		 * System.out.println("enter string names elements");
		   for(int i=0;i<n1;i++)
			{
				int num1=sc.next();
				arr1[i]=num1;
			}
			System.out.println("Displaying  String array elements");
			for(int i=0;i<n1;i++)
			{
				System.out.println(arr1[i]);
			}


		  */
		String[] arr1= {"one","two","three","four"};
		int n1=arr1.length;
		sortNumberArray(arr,n);
		sortStringArray(arr1,n1);

	}
}
