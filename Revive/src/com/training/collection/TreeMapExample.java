package com.training.collection;

import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class TreeMapExample {
	
    /* This is how to declare TreeMap */
	private TreeMap< Integer, String> treeMap = new TreeMap<Integer, String>(); 
	
	
	/*  	 */
	public void initializeMap() {
		/*Adding elements to TreeMap*/
	      treeMap.put(1, "Data1");
	      treeMap.put(23, "Data2");
	      treeMap.put(70, "Data3");
	      treeMap.put(4, "Data4");
	      treeMap.put(2, "Data5");

	}
	
	
	public void displayMap() {
		/* Display content using Iterator*/
	      Set set = treeMap.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
	      }
	}

   public static void main(String args[]) {
       
	   TreeMapExample testingTreeMapExample = new TreeMapExample();
	   testingTreeMapExample.initializeMap();
	   testingTreeMapExample.displayMap();
      
   }
}
