package Challenge_Problems;

import java.util.Scanner;

public class DigitRepeated {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int N = inp.nextInt();

        System.out.print("Enter the digit: ");
        int D = inp.nextInt();

        inp.close();

        int digits = No_Of_Digits(N, D);

        if (digits >= 2) {
            System.out.println("Digit " + D + " is repeated in " + N);
        }

        else {
            System.out.println("Digit " + D + " is *not* repeated in " + N);
        }


    }


    /**
     * @param Num The number
     * @param Digit The digit whose occurrence is to be found
     * @return No. of occurrences of the given digit in the number
     */
    public static int No_Of_Digits(int Num, int Digit) {

        int digits = Power_of_Ten(Num);
        int counter = 0;

        for (int check = 1; check <= digits; check++) {
            if (Num % 10 == Digit) {
                counter++;
            }

            Num /= 10;
        }

        return counter;


    }

    /**
     * @param num The number whose no. of digits is to be found
     * @return No of digits in the given number
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



