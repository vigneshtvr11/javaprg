package Collctns;

import java.util.ArrayList;
import java.util.Collections;

class person1 implements Comparable {

	String name;
	int k;
	int l;
	
	public person1(String name, int k, int l) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.k=k;
		this.l=l;
	}

	public String toString() {
		return name+" "+k+" "+l;

	}

	@Override
	public int compareTo(Object o) {
		person1 p=(person1)o; //neeed to change our class object 
		int result=this.name.compareTo(p.name);  //if*(this.name.length()>p.name.length())
		if (result>1) 							// return 1;
			return 1;

		if (result<1) 						//if*(this.name.length()<p.name.length())
			return -1;						// return -	1;
		else								//else
			return 0;							// return 0;
	}
}
	class StringCompreMulti {

		public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList nam= new ArrayList<>();

		person1 p1 = new person1("jne",40,50);
		person1 p2 = new person1("gwo",40,50);
		person1 p3 = new person1("ahree",40,50);
		person1 p4 = new person1("fur",40,50);
		person1 p5 = new person1("zive",40,50);

		nam.add(p1);
		nam.add(p2);
		nam.add(p3);
		nam.add(p4);
		nam.add(p5);

		System.out.println(nam);

		Collections.sort(nam); //i need to alphateic order so going collcts and  call compareTo methos  so neeed overrise so implements interface 

		System.out.println(nam);
	}

	}



