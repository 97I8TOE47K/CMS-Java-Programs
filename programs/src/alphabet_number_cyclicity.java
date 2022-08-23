import java.util.Scanner;

public class alphabet_number_cyclicity {
    public static void main(String[] args) {

        Scanner inputter = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char ch = inputter.next().charAt(0);

        System.out.print("Enter the number that brings forth change: ");
        int num = inputter.nextInt();

        inputter.close();

        if ((num <= 26 && num >= 1) || (num >= -26 && num <= -1)) {
            System.out.println("Output: " + (char) (ch + num));
        }

        else {
            System.out.println("Output: " + (char) (ch + (num % 26)));
        }

    }
}
