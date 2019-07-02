package com.ags;

public class Ques1 {
	
	public static void main(String[] args){
		int a[] = {9,9,9,9};
		Ques1 b = new Ques1();
		b.cal(a, 10);
		

}
	public void cal(int s[], int su){
		
		int total =0;
		double c;
		int n = 1;
		do{
		
		for(int i=0; i<s.length; i++){
			c= Math.ceil(s[i]/n);
			total += c;
	     }
		if(total<=su){
			System.out.println("minimum nuber is "+ n);
			break;
		}
		else{
			n++;
			total = 0;
			}
		}while(total<su);
	}
}
