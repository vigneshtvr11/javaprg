package Expt;

import java.util.Scanner;

public class ScannmultiExc {

	public static void main (String[] args) {
	Scanner scane = new Scanner(System.in);
	System.out.println("entr two vales");
	
	try {
	int a =scane.nextInt();
	int b =scane.nextInt();
	System.out.println(a/b);//   10/0 arihmic Excptin 
	}
	catch(ArithmeticException e)
	{
		System.out.println("ArithmeticException handld");
	}
	
	try {
	int arr[]= {1,2,4,5,6,5,3};
	System.out.println(arr[8]); //unsearching daa ArrayIndexOutOfBoundsException
		
	}
	catch(ArrayIndexOutOfBoundsException r)
	{
		System.out.println("ArrayIndexOutOfBoundsException handled");
	}
		
		System.out.println("final line");
	}
}
