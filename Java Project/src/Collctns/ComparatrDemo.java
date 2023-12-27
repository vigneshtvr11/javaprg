package Collctns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class mobile{

	String name;
	int price;
	int ram;
	public mobile(String name, int price, int ram) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.price=price;
		this.ram=ram;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return name +" "+price+" "+ ram;
	
	}
}
class hello implements Comparator{
	mobile m;
	public hello() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		mobile one=(mobile)o1;
		mobile two=(mobile)o2;
		if (one.price>two.price)
		return 1;
		if (one.price<two.price)
			return -1;
		else
			if (one.ram>two.ram) 
				return 2;
		if (one.ram<two.ram) 
			return -2;
		else
		return 0;
	}
	
}

public class ComparatrDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList mobiles =new ArrayList<>();

		mobile m1= new mobile("airtel",250,6);
		mobile m2= new mobile("vodafn",534,9);
		mobile m3= new mobile("jio",289,8);
		hello h =new hello();
		System.out.println(mobiles);
		
		mobiles.add(m1);
		mobiles.add(m2);
		mobiles.add(m3);
		
		
		
		Collections.sort(mobiles,h); //Here classCast Exception //1st comparable itself and 2nd comparator sort // we use 2nd cmp 
		System.out.println(mobiles);

	}

}

