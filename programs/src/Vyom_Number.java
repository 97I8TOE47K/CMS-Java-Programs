import java.util.Scanner;

public class Vyom_Number {
    public static void main(String[] args) {
        /* A number is a Vyom Number if it has a 0 anywhere in it */

        Scanner gib_me_nom = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = gib_me_nom.nextInt();
        gib_me_nom.close();

        int tp;

        for (int i = 1; ; i++) {
            if (num % (int)(Math.pow(10,i)) == num) {
                tp = i;
                break;
            }
        }

        boolean Vyom_N = false;

        for (int j = 1; j <= tp; j++) {
            if (num % 10 == 0) {
                Vyom_N = true;
                break;
            }

            num /= 10;

        }

        if (Vyom_N) {
            System.out.println("The number is a Vyom Number");
        } 
        
        else {
            System.out.println("The number is not a Vyom Number");
        }

    }
}