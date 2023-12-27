package Expt;

import java.util.Scanner;

public class UserdefndExptn2 {

	void police() throws Exception
	{
		Scanner scann = new Scanner(System.in);
		int weight=scann.nextInt();
		if(weight>70) {
			System.out.println("u are selected");
		}
		else
		{
		throw new ArithmeticException();
		//throws new Exception("u r nt selected"); //otherwise we use main method call using try/catch  
		}	
		}
	 void adv() {
		System.out.println("Try next time");

	}
	public static void main(String[] args) throws Exception {
		UserDefibExcpt uesrdfnd=new UserDefibExcpt();
	
		uesrdfnd.police(); // using try cactch or throws means main function  declaration 
		uesrdfnd.adv();
	}
}
