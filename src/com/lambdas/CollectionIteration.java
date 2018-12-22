package com.lambdas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionIteration {

	public static void main(String[] args) {
		
		List<Person> persons=new ArrayList<Person>();
       // persons.add(new Person("venu",20));
      //  persons.add(new Person("babu",20));
		Iterator<Person> it=persons.iterator();
		if(it.hasNext()){
			System.out.println(it.next());
		}
        
        persons.forEach(a->System.out.println(a));
        persons.stream().filter(p->p.age>10).map(Q->Q.firstname).collect(Collectors.toList());
        
        Map<String,String> map = new HashMap<String,String>();
        map.put("venubabu", "one");
        map.put("babu", "two");
        map.put("venkat", "four");
        map.put("venkat", "four");
        System.out.println("map values: "+map.entrySet().stream().filter(e-> e.getKey()=="venkat").map(am->am.getKey()));
        System.out.println("map values: "+map.keySet().stream().filter(e-> e=="venkat").count());
        System.out.println("map values: "+map.values().stream().filter(e-> e=="four").count());
        
      //  persons.forEach(System.out::println);
        Stream<Person> stream=persons.stream();
        System.out.println(stream);
        //Callable<String>[] c=new Callable<String>[]{ ()->"a", ()->"b", ()->"c" };
        
        try{


        	Callable<String>[] d=new Callable[]{ ()->"Hello from Callable a", 
        	()->"Hello from Callable b", ()->"Hello from Callable c" };

        	System.out.println(d[1].call());
        	}catch(Exception e){System.err.println(e.getMessage());}
        
	}

}
