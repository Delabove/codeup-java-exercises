import java.util.Scanner;

public class Bob {

public static void main (String args[]){

//    Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//    He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//    He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//    He answers 'Whatever.' to anything else.

    Scanner scanner = new Scanner(System.in);

    String userQuestion = scanner.nextLine();

    if( userQuestion.endsWith("?")){
        System.out.println("Sure.");
    } else if( userQuestion.endsWith("!")){
        System.out.println("Whoa, chill out! ");
    } else if( userQuestion.equals("")){
        System.out.println("Fine. Be that way! ");
    } else {
        System.out.println("Whatever. ");
    }




}

}
