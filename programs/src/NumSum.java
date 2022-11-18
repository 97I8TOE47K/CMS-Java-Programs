import java.util.Scanner;

public class NumSum {
    public static void main(String[] args) {
        /* This progam prints the sum of the first two digits of number
         * 
         * e.g.
         * 1234 -> 1 + 2 => 3 
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        input.close();
        
        int tp = Power_of_Ten(n);

        int temp = n;

        for (int i = 1; i <= (tp - 2); i++) {
            temp /= 10;
        }

        int sum = 0;

        for (int j = 1; j <= 2; j++) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("The sum of the first two digits of " + n + " is " + sum);

    }

    /* 
    * This function calculates the number of digits in a number by finding out the power of 10 
    * by which it must be divided so that the remainder is the number itself.
    *
    * e.g. Remainder of 9 divided by 10 (10 power 1) is 9, and the power (exponent) is equal to the number of digits in 9 (i.e. 1)
    * Similarly, Remainder of 258 divided by 10 power 3 (1000) is 258.
    */
    private static int Power_of_Ten(int num) {
        int tp = 0;

        for (int i = 1; ; i++) {
            if (num % (int)(Math.pow(10,i)) == num) {
                tp = i;
                break;
            }
        }

        return tp;
    }
    
}
