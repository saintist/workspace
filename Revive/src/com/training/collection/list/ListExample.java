package com.training.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
	
	public void showArrayList(){
		System.out.println("start showArrayList()");
		List<String> listStrings = new ArrayList<String>();
		listStrings.add("One");
		listStrings.add("Two");
		listStrings.add("Three");
		listStrings.add("Four");
		listStrings.add("Five");
		System.out.println("\t" + listStrings);
		System.out.println("end showArrayList()");
	}
	
	public void showLinkedList(){
		System.out.println("start showLinkedList()");	
		List<String> listStrings = new LinkedList<String>();
		listStrings.add("Five");
		listStrings.add("Six");
		listStrings.add("Seven");
		listStrings.add("Eight");
		System.out.println("\t" +listStrings.subList(2,4));
		
		List<Number> linkedNumbers = new LinkedList<>();
		 
		linkedNumbers.add(new Integer(123));
		linkedNumbers.add(new Float(3.1415));
		linkedNumbers.add(new Double(299.988));
		linkedNumbers.add(new Long(67000));
		
		System.out.println("\t" +linkedNumbers);
		
		
		
		
		System.out.println("end showLinkedList()");
	}
	
	
	

	public static void main(String[] args) {
		
		ListExample testList = new ListExample();
		
		/*
		 * ArrayList best to use 
		 *  - More of Search operation required
		 *  - Less Add and Remove
		 */
		testList.showArrayList();
		
		/*
		 * Linked list to be used 
		 *  - More Add and Remove operation
		 *  - Less Search operation
		 */
		testList.showLinkedList();

	}

}
