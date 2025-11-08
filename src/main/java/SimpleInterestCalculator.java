import java.util.Scanner;

public class SimpleInterestCalculator {

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Principal amount: ");
        double principal = in.nextDouble();

        System.out.println("Interest rate: ");
        double rate = in.nextDouble();

        System.out.println("Time (in years): ");
        double time = in.nextDouble();

        double interest = calculateSimpleInterest(principal, rate, time);
        double total = principal + interest;

        System.out.println("\n--- Simple Interest Report ---");
        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time +  " years");
        System.out.println("Interest: " + interest);
        System.out.println("Total Amount: " + total);

        in.close();
    }
}
