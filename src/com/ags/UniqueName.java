package com.ags;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class UniqueName {
    public static String firstUniqueName(String[] names) {
    	String value = null;
        Map<String,Integer> map = new HashMap<String,Integer>();
    	for(int i=0; i< names.length; i++){
    		if(map.containsKey(names[i])){
    		int c = map.get(names[i]);
    		map.put(names[i], ++c);	
    		}
    		else{
    			map.put(names[i], 1);
    		}
        	
        }
    	
    	for(int i=0; i< names.length; i++){
    		Integer intvalue = map.get(names[i]);
    		if(intvalue== 1){
    			for (Entry<String, Integer> entry : map.entrySet()) {
    		        if (entry.getValue().equals(intvalue)) {
    		            value = entry.getKey();
    		        } 
    			
    		}
    		}
    		else{
    			value = null;
    		}
    	}
    	return value;
        
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueName(new String[] { "Abbi", "Adeline", "Abbi", "Adalia" }));
    }
}
