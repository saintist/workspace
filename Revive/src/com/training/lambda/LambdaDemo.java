package com.training.lambda;

import java.util.Arrays;
import java.util.List;

interface A{
	
	void display();
	
}


//class AA implements A{
//	public void display() {
//		System.out.println(" Interface : AA ");
//	}
//}

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values = Arrays.asList(4,5,6,7,8,9);
		
		for ( int integer : values) {
			System.out.println("i :" + integer);
		}		
		values.forEach(action -> { 
			System.out.println("i :" + action);   
			System.out.println(" value[ "+action+" ]");
		
		});
		
//		A testA = new A(){
//			public void display(){
//				System.out.println(" Interface : A ");
//			}			
//		};
		
		A testA = () -> {  System.out.println(" Interface : A "); };
		
		testA.display();		
	}

}
