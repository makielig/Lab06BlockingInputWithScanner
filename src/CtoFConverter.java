import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double celsius, fahrenheit;
        System.out.print("Enter a temperature in Celsius: ");
        celsius = sc.nextDouble();
        fahrenheit = 32 + (celsius * 9 / 5);
        System.out.println(celsius + " ºC = " + fahrenheit + " ºF");

    }

}
