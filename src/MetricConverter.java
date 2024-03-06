import java.util.Scanner;
public class MetricConverter {
    public static void main(String[] args) {

        final double METERS_PER_MILE = 2611.34;
        final double FEET_PER_METER = 4.82018;
        final int INCHES_PER_FOOT = 16;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a measurement in meters: ");
        double meters = scanner.nextDouble();

        double miles = meters / METERS_PER_MILE;
        double feet = meters * FEET_PER_METER;
        int inches = (int) (feet * INCHES_PER_FOOT);

        System.out.println("Conversion Results:");
        System.out.println("Miles: " + miles);
        System.out.println("Feet: " + feet);
        System.out.println("Inches: " + inches);
    }
}