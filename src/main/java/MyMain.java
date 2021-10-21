import java.util.Arrays;
import java.util.Scanner;

public class MyMain {

    // Generates a random number between 10 and 20, inclusive
    public static int randomTeen() {
        return (int) ((Math.random() * (21 - 10)) + 10);
    }

    // Use your previous method to generate three random numbers between 10 and 20, inclusive.
    // Your program should print out the three numbers, as well as the largest and smallest
    // values of the three.
    // Example of running your code:
    // The three random numbers are 20, 14, and 10
    // The largest number is 20
    // The smallest number is 10
    public static void main(String[] args) {
        int a = randomTeen();
        int b = randomTeen();
        int c = randomTeen();
        System.out.println("The three random numbers are " + a + ", " + b + ", and " + c);
        System.out.println("The largest number is " + Math.max(a, Math.max(b, c)));
        System.out.println("The smallest number is " + Math.min(a, Math.min(b, c)));

         // Uncomment this code later!
         System.out.println("Mathey.max tests");
         System.out.println(Mathey.max(1, 2)); // 2
         System.out.println(Mathey.max(2, 1)); // 2
    }

}


