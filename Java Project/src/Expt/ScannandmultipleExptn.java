package Expt;

import java.util.Scanner;

public class ScannandmultipleExptn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);

try {
	System.out.println("Enter two values");
	int a=scan.nextInt();
	int b=scan.nextInt();

	System.out.println(a/b);

	
} catch (ArithmeticException e) {
	// TODO: handle exception
	System.out.println("ArithmeticException Handled" );
	}
try {
	int arr[]= {1,2,3,4,5};
	System.out.println();
	System.out.println(arr[5]);
	
} catch (ArrayIndexOutOfBoundsException e) {
	// TODO: handle exception
	System.out.println("ArrayIndexOutOfBoundsException Handled" );
}

	}

}
