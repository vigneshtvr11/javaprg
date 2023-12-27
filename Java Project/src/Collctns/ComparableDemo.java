package Collctns;

import java.util.ArrayList;
import java.util.Collections;

class pen implements Comparable{

	int i;
	public pen(int i) {
		// TODO Auto-generated constructor stub
		this.i=i;
	}
	
	//To string method override Object print means we go to Tostring methd , without cll execution mneans Address coming in 28
	public String toString() {
		return " "+i; // int value string methd nt return so " "+i consider as string then value
}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		pen p = (pen) o; // pen object common to both clas so  Typecast
		
		if (this.i>p.i) {
			return -1; //its ut from acending or dececnding just -1 negatiive number or 1 
		}
		if (this.i>p.i) {
			return 1;
		}
			else 
			
		
		return 0;
	}
}
public class ComparableDemo {

	public static void main(String[] args) {
		// Object print means we go to Tostring methd , without cll execution mneans Address
		ArrayList list = new ArrayList<>();
		pen hero = new pen(700);
		pen nataraj = new pen(100);
		pen cmlin = new pen(300);
		pen ryndls = new pen(500);
		
		System.out.println(hero);
		
		//*objects are added
		
		list.add(hero);
		list.add(nataraj);
		list.add(cmlin);
		list.add(ryndls);
		
		
		System.out.println(list);
		
		Collections.sort(list);// here ocur ClassCastException so we go to interface
		System.out.println(list);
	}

}
