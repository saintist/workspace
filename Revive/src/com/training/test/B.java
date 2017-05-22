package com.training.test;

public interface B {

	void add();
	default void show(){
		System.out.println("Trying defining an Interface : B");
	}	
}
