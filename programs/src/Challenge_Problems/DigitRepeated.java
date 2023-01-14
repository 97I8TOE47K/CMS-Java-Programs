package Challenge_Problems;

import java.util.Scanner;

public class DigitRepeated {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = inp.nextInt();

        System.out.print("Enter the digit: ");
        int D = inp.nextInt();

        inp.close();

        char[] numArr = (num + "").toCharArray();
        char D_char = (char)(D + '0');

        outer:
        for (int i = 0; i <= numArr.length - 1; i++) {
            for (int j = i+1; j <= numArr.length - 1; j++) {
                if (numArr[i] == numArr[j] && numArr[j] == D_char) {
                    System.out.println("The digit is repeated");
                    break outer;
                }
            }
        }
    }
}



