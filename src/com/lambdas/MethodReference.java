package com.lambdas;

import java.util.concurrent.Callable;

public class MethodReference {
	
	
	
	public static boolean printMessage(){
		return true; 
	}
    
	
	public static void main(String[] args){
		//Thread t =new Thread(()->printMessage());
		/*Thread t =new Thread(MethodReference::printMessage); // MethodReference::excecute == ()-> excecute();
		t.start();*/
		
		
		/* try {

	         Callable<Runnable> c = () -> () -> {
	            System.out.println("Hello from Callable");
	         };
	          c.call().run();

	      } catch (Exception e) {
	         System.err.println(e.getMessage());
	      }
		*/
	MethodReference m= new MethodReference();
	//System.out.println(MethodReference::printMessage);
	//System.out.println(m::printMessage);
	}

	
}
