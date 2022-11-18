package Challenge_Problems;

/**
 * This program inputs a number and checks if it is a 'Magic Number' or not.
 *
 * A number is a magic Number if the recursive sum of its digits is 1.
 * e.g. 1900
 *      1 + 9 + 0 + 0 = 10
 *      1 + 0 = 1
 *
 *      Hence, 1900 is a Magic Number
 *
 * */

import java.util.Scanner;

public class Magic_Number {
    public static void main(String[] args) {
        Scanner Magical_input = new Scanner(System.in);
        System.out.print("Enter the Magical Semblance: ");
        int N = Magical_input.nextInt();
        Magical_input.close();

        if (RecurSum(N) == 1) {
            System.out.println(N + " is a Magic number.");
        }

        else {
            System.out.println(N + " is not a Magic number.");
        }

    }

    private static int RecurSum(int num) {
        int sum = 0, RecurRat = num;

        while (RecurRat != 0) {
            sum += RecurRat % 10;
            RecurRat /= 10;
        }

        if (Power_of_Ten(sum) >= 2) {
            sum = RecurSum(sum);
        }

        return sum;
    }

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
