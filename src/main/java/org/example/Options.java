package org.example;

import java.util.Scanner;

public class Options {
    Scanner scanner = new Scanner(System.in);
    Search search = new Search();
    Printer printer = new Printer();
    JsonToJava jsonToJava = new JsonToJava();




    public void options() throws Exception {
       while (true){
           System.out.println(
                   "<-----------Options---------->\n" +
                           "1 Filimderdi Sort Kylyp Jyharat\n" +
                           "       1.1 Filmderdi alfabit boiunch chygaruu\n" +
                           "       1.2 Filmderdi Jyly Boiuncha Chygaruu\n" +
                           "       1.3 Filmderdi Description boiuncha chygaruu\n" +
                           "2 Filimderdin Aty menen Izdoo\n" +
                           "3 Filimderdi Cast menen Izdeoo\n" +
                           "4 Filimderdi Description menen Izdeoo\n" +
                           "5 Exit \n\n" +
                           "<----Plese Chose one Option!--->"

           );
           int optinNumber = scanner.nextInt();
           switch (optinNumber) {
               case 1:
                   // filimdin baaryn sort kylyp chygaruu
                   //sout kerek 1,2,3 degen
                   System.out.println(
                           "1 Filmderdi alfabit boiunch chygaruu\n" +
                                   "2 Filmderdi Jyly Boiuncha Chygaruu\n" +
                                   "3 Filmderdi Description boiuncha chygaruu\n" +
                                   "Chose one of this options?"
                   );
                   int optinNumber1 = scanner.nextInt();
                   switch (optinNumber1) {
                       case 1:
                           // alfabit boiuncha
                           printer.printer(search.sortByName(jsonToJava.pars()));


                           break;
                       case 2:
                           // jyl boiuncha
                           printer.printer(search.sortByYear(jsonToJava.pars()));

                           break;
                       case 3:
                           //Description
                           printer.printer(search.sortByDescription(jsonToJava.pars()));

                           break;
                       default:
                           throw new Exception("Chose corect Optin Number");
                   }
                   break;
               case 2:
                   // filmdin aty menen izdeoo
                   System.out.println("Enter Film Name: ");
                   String filmName = scanner.next();
                   printer.printer(search.searchWithName(jsonToJava.pars(),filmName));

                   break;

               case 3:
                   // filmdi Cast menen izdoo
                   System.out.println("Enter Cast name : ");
                   String castName = scanner.next();
                   printer.printer(search.searchWithCast(jsonToJava.pars(),castName));


                   break;

               case 4:
                   // filmdi Description menen izdoo
                   System.out.println("Enter Description: ");
                   String description = scanner.next();
                   printer.printer(search.searchWithDescriptions(jsonToJava.pars(),description));

                   break;
               case 5:
                   System.exit(0);
                   break;
               default:
                   throw new Exception("Chose correct option nmber");
           }

       }
    }
}
