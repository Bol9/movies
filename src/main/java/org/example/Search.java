package org.example;

import javax.management.Descriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Search {
    public List<Movies> sortByName(List<Movies> moviesList){

        Collections.sort(moviesList, new Comparator<Movies>() {
            @Override
            public int compare(Movies o1, Movies o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return moviesList;

    }

    public List<Movies> sortByYear(List<Movies> moviesList){
        Collections.sort(moviesList, new Comparator<Movies>() {
            @Override
            public int compare(Movies o1, Movies o2) {
                return Integer.compare((int)o2.getYear(),(int)o1.getYear());


            }
        });
        return moviesList;

    }
    public List<Movies> sortByDescription(List<Movies> moviesList){
        Collections.sort(moviesList, new Comparator<Movies>() {
            @Override
            public int compare(Movies o1, Movies o2) {
                return o1.getDescription().compareTo(o2.getDescription());


            }
        });
        return moviesList;
    }
    public List<Movies> searchWithName(List<Movies> moveList, String filmName){
        List<Movies> foundedFilms = new ArrayList<>();
        for (Movies film : moveList){
            if(film.getName().toLowerCase().contains(filmName.toLowerCase())){
                foundedFilms.add(film);
            }
        }
        return foundedFilms;
    }
    public List<Movies> searchWithCast(List<Movies> moveList, String filmCast){
        List<Movies> foundedFilms = new ArrayList<>();
        for (Movies film : moveList){
            for(Cast cast: film.getCast()){
                if(cast.getFullName().toLowerCase().contains(filmCast.toLowerCase())){
                    foundedFilms.add(film);
                }
            }

        }
        return foundedFilms;
    }
    public List<Movies> searchWithDescriptions(List<Movies> moviesList, String description){
        List<Movies> foundedFilms = new ArrayList<>();
        for(Movies movies: moviesList){
           if(movies.getDescription().toLowerCase().contains(description.toLowerCase())){
               foundedFilms.add(movies);
           }

        }
        return foundedFilms;
    }


}
