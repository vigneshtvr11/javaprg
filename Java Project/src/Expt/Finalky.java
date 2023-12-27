package Expt;

public class Finalky {

	static String name;
///whenever exception is ocurs are not finall block is always executed
	public static void main(String[] args) {
		System.out.println("welcome");
		try {
			System.out.println(name.length());

		}catch (NullPointerException e)

		{
			System.out.println("pls enter correct value");
		}	

		finally {
			System.out.println("Always Run");
		}
		System.out.println("bye");
	}
}
