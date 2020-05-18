package movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {

        boolean running = true;

        while (running) {
            System.out.println(menuDisplay());
            int response = promptUsersChoice();

            running = userChoice(response);
        }
    }

    private static boolean userChoice(int choice){
       boolean runApp = true;
        switch (choice){
            case 0:
                runApp = false;
                break;
            case 1:
                System.out.println("\n");
                for(Movie movie : MoviesArray.findAll()){
                    System.out.printf("%s -- %s \n", movie.getMovieName(), movie.getMovieCategory());
                }
                System.out.println("\n");
                break;
            case 2: //animated
                System.out.println("\n");
                movieList("animated");
                System.out.println("\n");
                break;
            case 3: //drama
                System.out.println("\n");
                movieList("drama");
                System.out.println("\n");
                break;
            case 4: //horror
                System.out.println("\n");
                movieList("horror");
                System.out.println("\n");
                break;
            case 5: //scifi
                System.out.println("\n");
                movieList("scifi");
                System.out.println("\n");
                break;
        }

        return runApp;
    }

    private static void movieList(String category) {
        for (Movie movie : MoviesArray.findAll()) {
            if (movie.getMovieCategory().equalsIgnoreCase(category)) {
                System.out.printf("%s -- %s\n", movie.getMovieName(), movie.getMovieCategory());
            }
        }
    }

    private static String menuDisplay() {

        String choices = "What would you like to do?\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category";

        return choices;
    }

    private static int promptUsersChoice() {
        Input input = new Input();
        System.out.println("Enter your choice: ");
        int response = input.getInt(0, 5);
        return response;
    }

}
