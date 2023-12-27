package Expt;

public class Runtme {
			static	String s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("dddddddddddd");
		
		//System.out.println(s.length());  // withut data nt find length NullPointerException
	try {
		System.out.println(s.length());
	} catch (NullPointerException e) {
		// TODO: handle exception
		System.out.println("no value for r");
	}	
	
	System.out.println("bye");
	
	}

}
