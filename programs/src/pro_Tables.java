/**
 * This programs inputs two numbers - x and y, and prints their tables in separate colums
 *
 * All thanks to the Jugaad Technology (#JT, God Damn Harkirat Sir is hyperawesome!) of @abhisheksaxena11jul (GitHub)
 * */
import java.util.Scanner;

public class pro_Tables {
    public static void main(String[] args) {
        Scanner tableau = new Scanner(System.in);

        System.out.print("Enter the smaller number: ");
        int x = tableau.nextInt();

        System.out.print("Enter the bigger number");
        int y = tableau.nextInt();

        for (int i = 1; i <= 10; i++) {
            for (int j = x; j <= y; j++) {
                System.out.print(j + " * " + i + " = " + i*j + "\t"); // Thanks chote UT for that "\t"
            }

            System.out.println();
        }


    }
}
