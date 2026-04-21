/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anany
 */
import java.util.Scanner;

interface Bill {
    double ct(int units);
}

class SmartPay implements Bill {

    private double taxam= 0;

    @Override
    public double ct(int units) {
        double tot = 0;

        if (units <= 100) {
            tot = units * 1.0;
        } else if (units <= 300) {
            tot = (100 * 1.0) + ((units - 100) * 2.0);
        } else {
            tot = (100 * 1.0) + (200 * 2.0) + ((units - 300) * 5.0);
        }

        taxam = tot * 0.10;

        return tot + taxam;
    }

    public double getTaxam() {
        return taxam;
    }
}

public class UtilityBiller {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SmartPay biller = new SmartPay();

        System.out.println("===== Welcome to SmartPay Utility Billing System =====");

        while (true) {

            System.out.print("\nEnter Customer Name (or type 'Exit' to quit): ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("Exit")) {
                System.out.println("Thank you for using SmartPay!");
                break;
            }

            System.out.print("Enter Previous Meter Reading: ");
            int prev = scanner.nextInt();

            System.out.print("Enter Current Meter Reading: ");
            int curr = scanner.nextInt();
            scanner.nextLine();

            if (prev > curr) {
                System.out.println("Error: Previous reading cannot be greater than current reading.");
                continue;
            }

            int units = curr - prev;

            double finaltot = biller.ct(units);
            double tax = biller.getTaxam();

            System.out.println("\n========= DIGITAL RECEIPT =========");
            System.out.println("Customer Name   : " + name);
            System.out.println("Units Consumed  : " + units);
            System.out.printf("Tax Amount (10%%): rs.%.2f\n", tax);
            System.out.printf("Final Total     : rs.%.2f\n", finaltot);
            System.out.println("===================================");
        }

        scanner.close();
    }
}