package Expt;

import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.Other;

public class UserDefibExcpt extends Object {

	void police() throws Exception
	{
		Scanner scann = new Scanner(System.in);
		int weight=scann.nextInt();
		if(weight>70) {
			System.out.println("u are selected");
		}
		else
		{
		throw new Exception();
		//throws new Exception("u r nt selected"); //otherwise we use main method call using try/catch  
		}	
		}
	 void adv() {
		System.out.println("Try next time");
	}
	public static void main(String[] args)  {
		//compli
		UserDefibExcpt uesrdfnd=new UserDefibExcpt();
		try {
			uesrdfnd.police(); // using try cactch or throws means main function  declaration 
		} catch (Exception e) {
			System.out.println(" Main catch Exp you r not selected ");
			e.printStackTrace();
		}
		uesrdfnd.adv();
	}

}
