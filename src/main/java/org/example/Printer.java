package org.example;

import java.util.List;

public class Printer {

    public void printer(List<Movies> moviesList){
        if(moviesList.isEmpty()){
            System.out.println("\n-------->No Result sorryyy(( <-----------\n\n");
        }else{
            System.out.println(
                            "--------------------------------------------------------------Found Films--------------------------------------------------------------------\n" +
                            "            Name Of Film                     | Year   | Description   | Director           |    Casts            \n" +
                            "---------------------------------------------+--------+---------------+--------------------+-------------------------------------------------"
            );
            for (Movies movie:moviesList) {
                System.out.print(movie.getName()+" ".repeat(45-movie.getName().length())+"|"+movie.getYear()+" ".repeat(4)+
                       "|"+ movie.getDescription()+" ".repeat(15-movie.getDescription().length())+
                        "|"
                );
                Director director = movie.getDirector();
                System.out.print(director.getFullName()+" ".repeat(20-director.getFullName().length()));

                List<Cast> casts = movie.getCast();
                boolean castCheker = false;
                for (Cast cast: casts) {
                    if(castCheker == false) {


                        System.out.println(
                                "|"+cast.getFullName() + " ".repeat(22 - cast.getFullName().length()) +
                                        "-> role:" + cast.getRole()
                        );
                    }else {
                        System.out.println(
                                " ".repeat(45)+"|"+" ".repeat(8)+"|"+" ".repeat(15)+"|"+" ".repeat(20)+"|"+
                                        cast.getFullName() + " ".repeat(22 - cast.getFullName().length()) +
                                        "-> role:" + cast.getRole()
                        );

                    }
                    castCheker = true;

                }
                System.out.println(
                        "---------------------------------------------+--------+---------------+--------------------+-------------------------------------------------"
                );

            }




        }

    }
}
