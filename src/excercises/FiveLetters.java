package excercises;

import java.util.ArrayList;

public class FiveLetters {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("Goodbye");
        words.add("Summer");
        words.add("Spring");
        words.add("Hurry");
        words.add("Homer");

        for ( String word : words) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }

}