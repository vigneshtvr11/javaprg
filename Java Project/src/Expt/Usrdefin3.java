package Expt;

import java.util.Scanner;

public class Usrdefin3 {
	 void Laptop() {
		Scanner scane= new Scanner(System.in);
		String name=scane.nextLine();
		System.out.println("Enter the requremnt");
		if (name.equals("csk")|(name.equals("rcb"))) {
			System.out.println("ok");
		} else {
			System.out.println("not ok");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usrdefin3 rr = new Usrdefin3();
		rr.Laptop();
	}

}
