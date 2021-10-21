public class Mathey {
    /* Write your own version of the Math.max method
     * Your method should be called max
     * This method should take **two integers** and return the larger integer
     * Ex. max(1, 2) => 2

     * You will need to practice writing the method signature below!
     * public static ...
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
    public static int max(int a, int b) {
    if(a >= b) return a;
    else return b;
    }



    /* Write another method called max that takes **two doubles**
     * Ex. max(1.2, 4.0) => 4.0
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
    public static double max(double a, double b) {
        if (a >= b) return a;
        else return b;
    }

    /* Write another method called max that takes **three integers**
     * Ex. max(1, 4, 2) => 4
     */
        public static int max(int a, int b, int c) {
            if (a >= b && a >= c) return a;
            if (b >= a && b >= c) return b;
            else return c;
        }




            /* Write another method called max that takes **four doubles**
     * Ex. max(1.0, 4.25, 1.3, 2.1) => 4.25
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
        public static double max(double a, double b, double c, double d) {
            if (a >= b && a >= c && a >= d) return a;
            if (b >= a && b >= c && b >= d) return b;
            if (c >= a && c >= b && c >= d) return c;
            else return d;
        }


    /* Write a method that takes **two integers** and generates a random
     * integer between the first integer and the second integer, inclusive
     * you may assume that the first integer is smaller than the second
     * You may use Math.random() here, but you can't use any other Math methods!
     * Ex. randomInteger(1, 4) => 3
     *     randomInteger(1, 4) => 2
     *     randomInteger(1, 4) => 4
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
       public static int randomInteger(int min, int max) {
           return (int) ((Math.random() * (max - min)) + min);
       }




    /* Write a method that takes **one integer** and generates a random
     * integer between 0 and the integer, inclusive
     * you may assume that the integer is greater than 0
     * Ex. randomInteger(5) => 3
     *     randomInteger(5) => 5
     *     randomInteger(5) => 0
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
    public static int randomInteger(int max) {
        return (int) ((Math.random() * max));
    }


    // YOU MAY WORK ON THE FOLLOWING METHODS IF YOU FINISH EARLY

    /* Write a method that takes **two integers** and calculates the exponent
     * that you get by raising the first integer to the second integer
     * you may assume that both integers are positive
     * Ex. pow(2, 5) => 32
     *     pow(3, 4) => 81
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
    public static int pow(int base, int degree) {
        int result = base;
        for (int i = 0; i < degree-1; i++) {
            result *= base;
        }
        return result;
    }



    /* Write a method that takes **one integer** and returns the
     * absolute value of that integer
     * Ex. abs(2) => 2
     *     abs(-2) => 2
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
    public static int abs(int x) {
        //just practicing using ? here. I heard about it and wanted to challenge myself to figure it out.
        return x >= 0 ? x : x + (2 * x * -1);
    }



    /* Write a method that takes **one double** and returns the
     * integer value that you get by rounding that double
     * You may assume that the integer is positive
     * Ex. round(2.4) => 2
     *     round(2.5) => 3
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
    public static int round(double x) {
        return (int) (x + 0.5);
    }




    /* Write a method that takes **one double** and returns the
     * floor of that value
     * The floor is defined as the **largest** integer that is **less than**
     * or equal to some value
     * You may assume that the integer is positive
     * Ex. floor(2.4) => 2
     *     floor(2.999999999999) => 2
     *
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
    public static int floor(double x) {
        return x >= 0 ? (int) x : (int) x + 1;
    }




    /* Write a method that takes **one double** and returns the
     * ceiling of that value
     * The ceiling is defined as the **smallest** integer that is **greater than**
     * or equal to some value
     * You may assume that the integer is positive
     * Ex. ceil(2.99999) => 3
     *     ceil(3.01) => 4
     */
    public static int ceiling(double x) {
        return x >= 0 ? (int) x + 1 : (int) x + 2;
    }



        /* Calculates the square root iteratively, using the Babylonian method
     * This method has been provided for you
     */
    public static double sqrt(double x) {
        double x1 = 5;
        double prev = 0;

        while (Math.abs(prev - x1) > 0.0001) {
            prev = x1;
            x1 = (x1 + x/x1) / 2;
        }

        return x1;
    }
//    public static double pythagorean(int a, int b, int c, char output) {
//        if(output == 'a') {
//            return sqrt(pow(c, 2) - pow(b, 2));
//        }
//        if(output == 'b')
//        return -1;
//    }



}