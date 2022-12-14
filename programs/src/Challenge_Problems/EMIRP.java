package Challenge_Problems;



import java.util.Scanner;

/**
 * This program checks if a number is an EMIRP Number or not.
 * <br>
 * A number is an EMIRP number if both it and its reverse are primes.
 */
public class EMIRP {
    public static void main(String[] args) {
        Scanner NaN = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = NaN.nextInt();
        NaN.close();

        int temp = N;
        int digits = Power_of_Ten(N);

        int reversed_N = 0;


        for (int c = digits - 1; c >= 0; c--) {
            reversed_N += (temp % 10) * Math.pow(10,c);
            temp /= 10;
        }

        if (isPrime(N) && isPrime(reversed_N)) {
            System.out.println(N + " is an EMIRP Number");
        }

        else {
            System.out.println(N + " is not an EMIRP Number");
        }

    }

    /**
     * This method checks if a number is prime or not
     * @param N The number
     * @return A {@code boolean} which tells if the number is prime
     */
    public static boolean isPrime(int N) {
        boolean Prime = true;

        for (int check = 2; check < N; check++) {
            if (N % check == 0) {
                Prime = false;
                break;
            }
        }

        return Prime;
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
