package Challenge_Problems;

import java.util.Scanner;

public class Smith {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = user.nextInt();

        user.close();

        int temp = N;
        int N_dig_sum = sum_digits(N);
        int factor_digit_sum = 0;

        for (int p = 2; temp > 1; ) {
            if (temp % p == 0) {
                factor_digit_sum += sum_digits(p);
                temp /= p;
            }

            else {
                p++;
            }
        }

        if (N_dig_sum == factor_digit_sum) {
            System.out.println("Smith Number");
        }

        else {
            System.out.println("Not a Smith Number");
        }



    }

    public static int sum_digits (int N) {
        int sum = 0;

        while (N > 0) {
            sum += N % 10;
            N /= 10;
        }

        return sum;
    }
}
