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
        System.out.println("Mathey.max tests:");
        System.out.println(Mathey.max(1, 2)); // 2
        System.out.println(Mathey.max(2.1, 2.21)); // 2.21
        System.out.println(Mathey.max(1, 2, 3)); //3
        System.out.println(Mathey.max(1.2345, 2.235, 3.2345, 8.2347)); //8.2347
        System.out.println(Mathey.randomInteger(20, 50)); //random between 20 and 50
        System.out.println(Mathey.randomInteger(42)); //random between 0 and 42
        System.out.println(Mathey.pow(2, 6)); // 64
        System.out.println(Mathey.abs(-5927)); //5927
        System.out.println(Mathey.round(9.89749238742398)); // 10
        System.out.println(Mathey.floor(0.314159265)); //0
        System.out.println(Mathey.ceiling(0.27182818)); //1

        double pythagResult;
        pythagResult = Mathey.round(Mathey.sqrt(Mathey.pow(5, 2) + Mathey.pow(12, 2)));

        System.out.println("the value of c if a = 5 and b = 12 is " + pythagResult);







    }

}


