package Expt;

import java.util.Scanner;

public class NsdTry {

	public void main (String[] args){
		// TODO Auto-generated constructor stub
		System.out.println("Entr 2 values");
		try
		{
			int a=10;
			int b=2;
			
			System.out.println(a/b);
			try
			{
				int arr[]= {1,2,3,4};
				System.out.println(arr[1]);
				try
				{
					String s=null;
					System.out.println(s.length());
				}
				catch(NullPointerException e)
				{
					System.out.println(e.getMessage());//Cannot invoke "String.length()" because "s" is null

				}
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				e.printStackTrace();//java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 4
				//at eveningbatch/Exception.nestedtry.main(nestedtry.java:14)

			}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);//java.lang.ArithmeticException: / by zero
		}

	}

}


