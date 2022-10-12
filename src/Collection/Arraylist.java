package Collection;

import java.util.ArrayList;
import java.util.Iterator;

class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al= new ArrayList();// creating an object to concrete class
		al.add(56);
		al.add("Atul");
		al.add(45.34);
		al.add('a');
		// heterogenous collection of object 
		System.out.println(al);
		System.out.println(al.size());
		
		
		// removing 
		System.out.println(al.remove(3));
		
		// Searching 
		System.out.println(al.contains(null));
		System.out.println(al.contains(56));
		
		//accessing 
		//using iteration 
		Iterator It= al.iterator();// converting  the collection into iterator type
		while(It.hasNext())// checking if the element is next to cursor or not 
		{
			System.out.println(It.next()); // fetch the element 
		}
		
		//for each loop for accessing the element of collection 

		System.out.println();
		for (Object o:al)
		{
			System.out.println(o);
		}
	}

}
