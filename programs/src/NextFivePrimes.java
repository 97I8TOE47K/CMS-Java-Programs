import java.util.Scanner;

public class NextFivePrimes {
    public static void main(String[] args) {

        Scanner inputter = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = inputter.nextInt();
        inputter.close();

        int NR = N + 1,
            counter = 0;

        for (counter = 1; counter <= 5; NR++) {
            boolean Prime = true;

            for (int i = 2; i < NR; i++) {
                if (NR % i == 0) {
                    Prime = false;
                    break;
                }
            }

            if (Prime) {
                System.out.println(NR);
                counter++;
            }
        }

    }
}
