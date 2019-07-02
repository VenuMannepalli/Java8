package com.ags;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class MovieNight {
    public static Boolean canViewAll(List<Movie> movies) {
    	boolean value = false;
    	Collections.sort(movies, new Comparator<Movie>(){

			@Override
			public int compare(Movie m1, Movie m2) {
				int v = m1.getStart().compareTo(m2.getStart());
				return v;
			}
    		
    	});

    	for(int i=0,j=i+1; i<movies.size()&&j<movies.size();i++,j++){
    		if(((movies.get(i).getStart().getTime())-(movies.get(j).getStart().getTime()))>0){
    			value = false;
    		}
    		else{
    			value = true;
    		}
    	}
    	movies.forEach(k->System.out.println(k.getStart()));
        return value;
    }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("y-M-d H:m");

        ArrayList<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie(sdf.parse("2015-01-01 20:00"), sdf.parse("2015-01-01 21:30")));
        movies.add(new Movie(sdf.parse("2015-01-01 23:10"), sdf.parse("2015-01-01 23:30")));
        movies.add(new Movie(sdf.parse("2015-01-01 21:30"), sdf.parse("2015-01-01 23:00")));

        System.out.println(MovieNight.canViewAll(movies));
    }
}

class Movie {
    private Date start, end;
    
    public Movie(Date start, Date end) {
        this.start = start;
        this.end = end;
    }
    
    public Date getStart() {
        return this.start;
    }
    
    public Date getEnd() {
        return this.end;
    } 
}