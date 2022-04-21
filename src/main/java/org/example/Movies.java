package org.example;

import java.util.List;

public class Movies {

//    {
//        "name": "Good omens",
//            "year": 2019,
//            "description": "TV Series",
//            "director": {
//        "fullName": "Douglas Mackinnon"
//    },
//        "cast": [
//        {
//            "fullName": "Michael Sheen",
//                "role": "Aziraphale"
//        },
//        {
//            "fullName": "David Tennant",
//                "role": "Crowley"
//        }
//      ]
//    },

    private String name;
    private long year;
    private String description;
    private Director director;
    private List<Cast> cast;

    public Movies() {
    }

    public Movies(String name, long year, String description, Director director, List<Cast> cast) {
        this.name = name;
        this.year = year;
        this.description = description;
        this.director = director;
        this.cast = cast;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Cast> getCast() {
        return cast;
    }

    public void setCast(List<Cast> cast) {
        this.cast = cast;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", description='" + description + '\'' +
                ", director=" + director +
                ", cast=" + cast +
                '}';
    }
}
