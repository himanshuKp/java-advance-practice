/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 31/07/21, 9:12 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie implements Comparable<Movie> {
    private String name;
    private double rating;
    private int year;

    @Override
    public int compareTo(Movie o) {
        return this.year - o.year;
    }

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }
}

class NameComparator implements Comparator<Movie>{
    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class RatingComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        if (o1.getRating()<o2.getRating())
            return -1;
        else if(o1.getRating() > o2.getRating())
            return 1;
        else
            return 0;
    }
}

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

//        sort by rating
        System.out.println("Sort by rating: ");
        RatingComparator ratingComparator = new RatingComparator();
        Collections.sort(list, ratingComparator);
        for (Movie movie: list){
            System.out.println("Movie: "+movie.getName()+", has rating of: "+movie.getRating()+", released in "+movie.getYear());
        }

//        sort by year
        System.out.println("\nSorting by year");
        Collections.sort(list);
        for (Movie movie: list){
            System.out.println("Movie: "+movie.getName()+", has rating of: "+movie.getRating()+", released in "+movie.getYear());
        }

//        sort by name
        System.out.println("\nSorting by name");
        Collections.sort(list, new NameComparator());
        for (Movie movie: list){
            System.out.println("Movie: "+movie.getName()+", has rating of: "+movie.getRating()+", released in "+movie.getYear());
        }
    }
}
