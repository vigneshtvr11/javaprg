package Collectn;

import java.util.ArrayList;
import java.util.List;

public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 ArrayList <Integer> li = new ArrayList<>();
 ArrayList nli = new ArrayList<>();
 List list =new ArrayList<>(); //dynamic cretion
 
 //add
 
 li.add(3);
 li.add(5);//insertion ordr maintain
 li.add(7);//multiple null and duplicates are allowed
 li.add(7);
 li.add(9);
 li.add(null);
 li.add(null);// Here generics maintain so we nt supprt string
 li.add(3);
 System.out.println(li);
 
 nli.add(3);
 nli.add("string");
 nli.add(4);
 nli.add(5);
 nli.add(7);
 nli.add(9);
 System.out.println(nli);
 
 list.add(3.5);
 list.add(4);
 System.out.println(list);
 
 //adall
 list.addAll(nli);
 System.out.println(list);
 
 System.out.println(list.contains(4));
	}

}
