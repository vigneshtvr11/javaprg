package Collctns;

import java.util.ArrayList;
import java.util.Collections;
class person implements Comparable{
	String name;
	public person(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	
	public String toString() {
		return name;
		
	}

	@Override
	public int compareTo(Object o) {
		person p=(person)o; //neeed to change our class object 
		int result=this.name.compareTo(p.name);  //if*(this.name.length()>p.name.length())
		if (result>1) 							// return 1;
			return 1;
		
		if (result<1) 						//if*(this.name.length()<p.name.length())
			return -1;						// return -	1;
		else								//else
		return 0;							// return 0;
	}
}

public class StrinCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList nameee= new ArrayList<>();

	person p1 = new person("one");
	person p2 = new person("gwo");
	person p3 = new person("ahree");
	person p4 = new person("fur");
	person p5 = new person("zive");
	
	nameee.add(p1);
	nameee.add(p2);
	nameee.add(p3);
	nameee.add(p4);
	nameee.add(p5);

System.out.println(nameee);

Collections.sort(nameee); //i need to alphateic order so going collcts and  call compareTo methos  so neeed overrise so implements interface 
	
System.out.println(nameee);
}

}
