package com.lambdas;

public class ThisRefer {
	
	public void process(int i, Thisre r){
		r.print(i);
		
	}
	public void excecute(){
		System.out.println(this);                         //Scenario 3
	}

	public String toString(){
		return "this is main class reference";
	}
	public static void main(String[] args) {
		//System.out.println(this); error -in static scope we cannot use this
		ThisRefer thisRefer=new ThisRefer();
		thisRefer.process(50, (i)->{
			System.out.println(i);
			//System.out.println(this); error                //Scenario 2
		}
				
				/* new Thisre(){

			@Override
			public void print(int i) {
				System.out.println(i);                                //Scenario 1
				System.out.println(this);//com.lambdas.ThisRefer$1@15db9742
				
			}
			
		}*/
				);
		thisRefer.excecute();
	}

}

interface Thisre{
	
	void print(int i);
}
