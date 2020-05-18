import javax.crypto.spec.PSource;
import javax.imageio.stream.ImageInputStream;
import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {

    public static String[] adjectives = {"Loud", "Bright", "Cheerful", "Pretty", "Difficult", "Grumpy", "Sunny", "Powerful", "Smart", "Ambitious"} ;

    public static String[] nouns = {"Computer", "Car", "Bike", "Boy", "Girl", "Dog", "Pen", "Drink", "Horse", "Pool"} ;

    public static void main(String[] args) {
        System.out.println("Your server name is:");
        System.out.println(getWord(adjectives) + "-" + getWord(nouns));
    }
    public static String getWord(String[] choices){
        Random rnd = new Random();
        int randomString = rnd.nextInt(choices.length);
        return choices[randomString];
    }

}
