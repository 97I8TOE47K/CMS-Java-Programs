public class SumSeries {
    public static void main(String[] args) {
        int N = 4,
            sum = 0;

        for (int i = 2; i <= N; i++) {
            sum += (i) * (i+1) / 2;
        }

        System.out.println("The sum is: " + sum);


    }
}
