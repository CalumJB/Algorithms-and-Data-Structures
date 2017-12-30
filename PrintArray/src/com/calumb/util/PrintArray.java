package com.calumb.util;

public class PrintArray {
	
	public static void printIntArray(int[] array)
	{
		int length = array.length;
		
		if(length<1)
		{
			System.out.println("Array empty");
			return;
		}
		
		
		for(int i=0; i< length; i++)
		{
			System.out.printf("----", array[i]);
		}
		System.out.println("-");
		
		System.out.print("|");
		for(int i=0; i< length; i++)
		{
			System.out.printf(" %d |", array[i]);
		}
		System.out.println();
		

		for(int i=0; i< length; i++)
		{
			System.out.printf("----", array[i]);
		}
		System.out.println("-");
	}
	

}
