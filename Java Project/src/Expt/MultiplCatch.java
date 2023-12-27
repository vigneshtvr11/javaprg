package Expt;

import java.util.Scanner;

public class MultiplCatch {	
		public static  void main  (String[] args) {
			Scanner scann = new Scanner(System.in);
			System.out.println("Enter two valus");
			
		
			int a =scann.nextInt();
			int b =scann.nextInt() ;
			//int c = a/b ;
		
			System.out.println(a/b);
			try {
			int arr[]= {1,2,3,4};
			System.out.println(arr[5]);
			
			}			catch(ArrayIndexOutOfBoundsException| ArithmeticException e)
			
			{
				System.out.println("ArrayIndexOutOfBoundsException Handled");
			}
			

			
			
		}
	}


