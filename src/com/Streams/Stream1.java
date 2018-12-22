package com.Streams;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream1 {
	
	
	public static void main(String args[]) throws IOException{
		// Creating Streams
		Stream<Integer> numbersFromValues = Stream.of(1, 2, 3, 4);
		int[] numbers1 = {1, 2, 3, 4};
		IntStream numbersFromArray = Arrays.stream(numbers1);
		
		
		List<Integer> numbers = Arrays.asList(1,10,8, 2, 3, 4, 5, 6, 7, 8);
		Stream<Integer> twoEvenSquares = 
		    numbers.stream()
		           .filter(n -> {
		                    System.out.println("filtering " + n); 
		                    return n % 2 == 0;
		                  })
		           .map(n -> {
		                    System.out.println("mapping " + n);
		                    return n * n;
		                  })
		           .limit(2)
		           ;
		//System.out.println(twoEvenSquares); // java.util.stream.SliceOps$1@53d8d10a
		System.out.println(twoEvenSquares.count()); // Streams are lazy because until any termination operation is called the intermediate operations can not be performed.
		
		//System.out.println(twoEvenSquares.reduce((a,b)->(a+b)));
		//System.out.println(twoEvenSquares.reduce(0,(a,b)->(a+b)));
		
		boolean expensive =numbers.stream().allMatch(t -> t > 100);
		//System.out.println(expensive);
		
		String[] arrayOfWords = {"Java", "Magazine"};
		Stream<String> streamOfwords = Arrays.stream(arrayOfWords);
		//System.out.println(streamOfwords);
		
		
		Stream<String> words = Stream.of("Java", "Magazine", "is",  "the", "best");
        Map<String, Long> letterToCount = words.map(w -> w.split(""))
			                                   .flatMap(Arrays::stream)
			                                   .collect(groupingBy(identity(), counting()));
        
        
        List<String> a= Files.lines(Paths.get("C://Users//Lavs//Desktop//password.txt"))
                .map(line -> line.split("\\s+")) // Stream<String[]>
                .flatMap(Arrays::stream) // Stream<String>
                .distinct() // Stream<String>
                .collect(toList());
       // System.out.println("size is:"+ a.size());
        
        }

}
