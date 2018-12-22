package com.lambdas;

//@FunctionalInterface
public interface MyLambda {
	String a = null;
	//int foo(int a, int b); // if arguments are there means you definetly make interface as  FunctionalInterface
    void display();
    default void venu(String a) {
    	//this.a="venu";//The final field MyLambda.a cannot be assigned
	}
}
