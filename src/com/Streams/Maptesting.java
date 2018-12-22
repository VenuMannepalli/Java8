package com.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Maptesting {
	
	
	public static void main(String[] args) {
		
		List<String> a=new ArrayList<String>();
		
		Map<String,Integer> m= new TreeMap<String,Integer>();
	    m.put("venu",10);m.put("babu",1); m.put("adarsh",15);
		//m.forEach((k,v)->System.out.println("key: "+k +" value: "+v));
		//m.entrySet().stream().forEach(e->System.out.println(e.getKey() +":" + e.getValue()));
		
		String s="I:/am from:India";
		String []strArray=s.split(":/");
		for(int i=0; i<strArray.length;i++) 
		     System.out.println("Index of each String is : " + i+ " " +strArray[i]);
		
		                                     
	}

}
