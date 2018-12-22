package com.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lexamples {
	
    public static void action(String a, Foo b)
	{
		System.out.println(a+b);
	}
	
	public static void action1(String a, Function<String,String> f)
	{
		System.out.println(a+f);
	}
	
	public static void main(String args[])
	{
		
		Foo foo= venubabu->venubabu +"from lambda";
		Lexamples.action("oops ", foo);
		
		Function<String,String> f= venubabu->venubabu +"from lambda";
		Lexamples.action1("default ", f);
		
		
		
       // MyLambda c= (int a, int b)->a+b;
       // c.foo(10, 20);
		MyLambda lambda= ()-> System.out.println("hello");
		//lambda.display();
		
		MyLambda innerclass=new MyLambda() {
			
			@Override
			public void display() {
				
				//System.out.println("hello");
			}
		};
        
		innerclass.display();
        //System.out.println(c.toString());
		
		//using Runnable interface which is having one method
		Thread Lthread= new Thread(()-> System.out.println("started"));
		//Lthread.start();
		
		List<Person> p=new ArrayList<Person>();
		p.add(new Person("venu","",30, 0));
		p.add(new Person("babu",null, 10, 0));
		p.add(new Person("manne",null, 5, 0));
		
	   /*Java 7 sorting
	    * 
	    *  Collections.sort(p, new Comparator<Person>() {
             public int compare(Person o1, Person o2) {
				
				return o1.getAge()-o2.getAge();
			}
	    	
		});*/
		
		Collections.sort(p, (o1,o2)->o1.getAge()-(o2.getAge()));
		printConditionally(p, pe->true);
		
		System.out.println("printing persons");
		printConditionally(p, per-> per.firstname.startsWith("v"));
		
		
		
	}

	private static void printConditionally(List<Person> p, Predicate<Person> c) {
		for (Person a: p)
		{
			if(c.test(a))
				System.out.println(a.firstname);
		}
		}
	
	
	
	
}
