import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of gallons of gas in the tank: ");
        double gallonsOfGas = scanner.nextDouble();

        System.out.print("Enter the fuel efficiency in miles per gallon: ");
        double fuelEfficiency = scanner.nextDouble();

        System.out.print("Enter the price of gas per gallon  in dollars: ");
        double pricePerGallon = scanner.nextDouble();

        double costPer100Miles = (100 / fuelEfficiency) * pricePerGallon;
        double milesWithGas = gallonsOfGas * fuelEfficiency;

        System.out.println("The cost per 100 miles is $" + costPer100Miles);
        System.out.println("The car can go " + milesWithGas + " miles with the gas in the tank.");

        scanner.close();
    }
}
