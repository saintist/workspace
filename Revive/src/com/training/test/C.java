package com.training.test;

public class C implements A, B {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("some thing added");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		A.super.show();
		B.super.show();
	}
	
	public static void main (String args[]){
		C interfaceDefinition = new C();
		interfaceDefinition.add();
		interfaceDefinition.show();
	}

}
