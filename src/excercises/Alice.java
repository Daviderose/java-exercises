package excercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String sentence;
        String word;
        Scanner in;

        sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing " +
                "to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or " +
                "conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        sentence = sentence.toLowerCase();

        in = new Scanner(System.in);
        System.out.println("What word would you like to check? ");
        word = in.nextLine();


        System.out.println(word + " is in sentence (T/F): "+ sentence.contains(word));
    }
}
