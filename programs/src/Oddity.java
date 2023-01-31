/**
 * Pattern:
 * 1
 * 3    2
 * 4    5   6
 * 10   9   8   7
 *
 * */

public class Oddity {
    public static void main(String[] args) {
        int N = 1;

        for (int i = 1; i <= 4; i++) {

            if (i % 2 != 0) {

                for (int j = 1; j <= i; j++) {
                    System.out.print(N + "\t");
                    N += 1;
                }

            }

            else {

                int temp = N + (i-1);

                for (int j = temp; j >= N; j--) {
                    System.out.print(j + "\t");
                }

                N = temp + 1;

            }

            System.out.println();

        }
    }
}
