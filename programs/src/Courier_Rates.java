import java.util.Scanner;

public class Courier_Rates {
    static int rate_o_0_100 = 80, rate_o_100_500 = 150, rate_o_500 = 210;
    static int rate_e_0_100 = 100, rate_e_100_500 = 200, rate_e_500 = 300;

    public static void main(String[] args) {
        Scanner give_me_info = new Scanner(System.in);

        System.out.print("Enter the weight of the package (in grams): ");
        double package_weight = give_me_info.nextDouble();

        System.out.println();

        System.out.print("(1) Ordinary\n(2) Express\n\nChoose the mode of delivery (1 or 2): ");
        byte delivery_type = give_me_info.nextByte();

        give_me_info.close();

        System.out.println("The rate for your delivery is: Rs. " + the_mind_of_the_class(package_weight, delivery_type));
    }

    public static double the_mind_of_the_class(double package_weight, byte delivery_type) {
        if (delivery_type == 1) {
            return ordinary_delivery(package_weight);
        }

        else if (delivery_type == 2) {
            return express_delivery(package_weight);
        }

        else {
            throw new RuntimeException("Correct delivery type (as numeral) not in function 'the_mind_of_the_class'");
        }
    }

    private static double ordinary_delivery(double package_weight) {
        if (package_weight <= 100) {
            return rate_o_0_100;
        }

        else if (package_weight <= 500) {
            return rate_o_100_500;
        }

        else {
            return rate_o_500;
        }
    }

    private static double express_delivery(double package_weight) {
        if (package_weight <= 100) {
            return rate_e_0_100;
        }

        else if (package_weight <= 500) {
            return rate_e_100_500;
        }

        else {
            return rate_e_500;
        }
    }
}
