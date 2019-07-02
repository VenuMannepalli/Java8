package com.ags;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Needle {
    public static int count(String needle, InputStream haystack) throws Exception {
    	String str = new BufferedReader(new InputStreamReader(haystack))
    			  .lines().collect(Collectors.joining("\n"));
    	
    	
    	Pattern p = Pattern.compile(needle);
    	Matcher m = p.matcher(str);
    	int count = 0;
    	while (m.find()){
    	    count +=1;
    	} 
    	return count;
    }
    
    public static void main(String[] args) throws Exception {
        String inMessage = "Hello, there!\nHow are you today?\nYes, you over there.";

        try(InputStream inStream = new ByteArrayInputStream(inMessage.getBytes())) {
            System.out.println(Needle.count("there", inStream));
        }
    }
}