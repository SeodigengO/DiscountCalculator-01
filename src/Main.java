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

        double discount = price * (percentage/100);

        System.out.println("The final price is " + (price - discount));
    }
}