package main;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a price of an item: ");
        double price = scanner.nextDouble();

        System.out.print("Enter discount percentage: ");
        double percentage = scanner.nextDouble();

        DiscountCalculator discountCalculator = new DiscountCalculator(price,percentage);

        double discountedPrice = discountCalculator.discountedPrice();

        System.out.println("The final price is " + discountedPrice);
    }
}