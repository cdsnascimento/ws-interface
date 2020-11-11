package application;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilIntrestService;
import services.InterestService;
import services.UsaIntrestService;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();

        System.out.print("Months: ");
        int months = sc.nextInt();

        InterestService isU = new UsaIntrestService(1.0);
        double payment = isU.payment(amount, months);

        System.out.println("USA Payment after " + months + " months:");
        System.out.println(String.format("%.2f", payment));
        
        InterestService isB = new BrazilIntrestService(2.0);
        payment = isB.payment(amount, months);

        System.out.println("Brazilian Payment after " + months + " months:");
        System.out.println(String.format("%.2f", payment));

        sc.close();
        
    }

}
