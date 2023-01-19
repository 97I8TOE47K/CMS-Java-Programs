package Patterns;

/*
* Pattern:
*
* 55555
* 54444
* 54333
* 54322
* 54321
*
*
* */

public class Diagonal {
    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {
            int c = 0;

            for (int j = 5; j >= i; j--, c++) {
                System.out.print(j);
            }

            int R = 5 - c;

            for (int k = 1; k <= R; k++) {
                System.out.print(i);
            }

            System.out.println();
        }

    }


}

