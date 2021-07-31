/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 31/07/21, 9:00 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.comparable;

import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable<Movie>{
    private double rating;
    private String name;
    private int year;

    @Override
    public int compareTo(Movie o) {
        return this.year - o.year;
    }

    public Movie(double rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Movie> movieArrayList = new ArrayList<>();
        movieArrayList.add(new Movie(8.3,"Movie A", 1999));
        movieArrayList.add(new Movie(1.1, "Movie B", 1990));
        movieArrayList.add(new Movie(2.5, "Movie C", 2000));

        Collections.sort(movieArrayList);
        System.out.println("Movie after sorting: ");
        for (Movie movie: movieArrayList){
            System.out.println(movie.getName()+" : "+movie.getRating()+" : "+movie.getYear());
        }
    }
}
