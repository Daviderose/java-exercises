package excercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        int length;
        int width;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("What is the length of the rectangle? ");
        length = in.nextInt();
        System.out.println("What is the width of the rectangle? ");
        width = in.nextInt();

        System.out.println("The area of the rectangle is: "+ (length*width));
    }
}