import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Fibo(7); // Replace 7 with your number of choice

    }
        private static void Fibo(int NE) {
            int T1 = 0, T2 = 1;

            System.out.println(T1);

            for (int i = 1; i <= NE-1; i++) {
                System.out.println(T2);
                int T2_reserve = T2;
                T2 += T1;
                T1 = T2_reserve;

        }

    }
}

