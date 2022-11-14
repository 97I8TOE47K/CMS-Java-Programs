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
