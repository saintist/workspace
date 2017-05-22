package com.training.test;

public interface A {
	
	void add();
	default void show(){
		System.out.println("Trying defining an Interface : A ");
	}

}
