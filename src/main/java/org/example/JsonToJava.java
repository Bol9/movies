package org.example;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JsonToJava {
    JSONParser parser = new JSONParser();

    Movies movies = new Movies();

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




    public List<Movies> pars() throws IOException {
        try(FileReader fileReader = new FileReader("src/movies.json")){

            JSONObject jsonObject = (JSONObject) parser.parse(fileReader);

            JSONArray movies1 = (JSONArray) jsonObject.get("movies");

            List<Movies> moviesList = new ArrayList<>();

            for (Object movies: movies1) {
                List<Cast> casts = new ArrayList<>();

                JSONObject film =(JSONObject) movies ;
                String name = (String) film.get("name");
                Long year = (Long) film.get("year");
                String description = (String) film.get("description");
                JSONObject director1 = (JSONObject) film.get("director");
                String director2 = (String) director1.get("fullName");
                Director director = new Director(director2);


                JSONArray cast = (JSONArray) film.get("cast");
                List<Cast> casts1 = new ArrayList<>();

                for (Object one:cast) {
                    JSONObject jsonObject1 = (JSONObject) one;
                    String fullName = (String) jsonObject1.get("fullName");
                    String role = (String) jsonObject1.get("role");
                    casts1.add(new Cast(fullName,role));

                }
                moviesList.add(new Movies(name,year,description,director,casts1));








            }


            return moviesList;


        }catch(IOException e){
            System.out.println("Exeptin "+e.getMessage());

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;


    }
}
