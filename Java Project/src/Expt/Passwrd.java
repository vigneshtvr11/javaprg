package Expt;

import java.util.Scanner;

public class Passwrd {

	void Passwrd() {	
		// TODO Auto-generated constructor stub
		Scanner scn = new Scanner(System.in);
		try {
		System.out.println("Enter passwrd");
		int psd = scn.nextInt();
		System.out.println(psd);
		}
		catch(Exception q)
		{
			System.out.println("please enter corrcet passwrd");
			Passwrd();
		}
	}

	public static void main (String[] args) {
		
		Passwrd pssws = new Passwrd();
		pssws.Passwrd();
		
	}
}
