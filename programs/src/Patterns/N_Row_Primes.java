package Patterns;

import java.util.Scanner;

public class N_Row_Primes {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("n: ");
        int n = scnr.nextInt();
        scnr.close();

        int s = 2;

        for (int i = 1; i <= n; i++) {
            for (int P = 1; P <= i; ) {
                for (int w = s; ; w++) {
                    if (CheckPrime(w)) {
                        System.out.print(w + "\t");
                        P += 1;
                        s = w + 1;
                        break;
                    }

                }

            }

            System.out.println();
        }

    }

    public static boolean CheckPrime(int N) {
        boolean Prime = true;

        for (int b = N - 1; b >= 2; b--) {
            if (N % b == 0) {
                Prime = false;
                break;
            }
        }

        return Prime;
    }

}
