package Collctns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import Collectn.list;

public class Democltns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList list = new ArrayList<>();

list.add(100);
list.add(50);
list.add(80);
list.add(60); 
list.add(30);

System.out.println(list);

Collections.sort(list);
System.out.println(list);//NATURL SORT ORDER  //CompareTo  //

Collections.reverse(list);
System.out.println(list);
System.out.println(Collections.max(list));
//System.out.println();

int a[]= {67,23,43,21,14,70,60};
Arrays.sort(a);
System.out.println(Arrays.toString(a));

String ar[]= {"698","034","436"};
System.out.println(Arrays.toString(ar));

Arrays.sort(ar);
System.out.println(Arrays.toString(ar));


	}

}
